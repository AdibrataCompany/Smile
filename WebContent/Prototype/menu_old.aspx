<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
   <HEAD>
   <link rel="stylesheet" href="inc-0100-00.css">
   <script language="javascript">

// ****************************************************************
// You are free to copy the "Folder-Tree" script as long as you
// keep this copyright notice:
// Script found in: http://www.geocities.com/Paris/LeftBank/2178/
// Author: Marcelino Alves Martins (martins@hks.com) December '97.
// ****************************************************************
// Log of changes:
//       17 Feb 98 - Fix initialization flashing problem with Netscape
//
//       27 Jan 98 - Root folder starts open; support for USETEXTLINKS;
//                   make the ftien4 a js file
//
// Definition of class Folder
// *****************************************************************

function Folder(folderDescription, hreference) //constructor
{
  //constant data
  this.desc = folderDescription
  this.hreference = hreference
  this.id = -1
  this.navObj = 0
  this.iconImg = 0
  this.nodeImg = 0
  this.isLastNode = 0

  //dynamic data
  this.isOpen = true
  this.iconSrc = "images/down.gif"
  this.children = new Array
  this.nChildren = 0

  //methods
  this.initialize = initializeFolder
  this.setState = setStateFolder
  this.addChild = addChild
  this.createIndex = createEntryIndex
  this.hide = hideFolder
  this.display = display
  this.renderOb = drawFolder
  this.totalHeight = totalHeight
  this.subEntries = folderSubEntries
  this.outputLink = outputFolderLink
}

function setStateFolder(isOpen)
{
  var subEntries
  var totalHeight
  var fIt = 0
  var i=0

  if (isOpen == this.isOpen)
    return

  if (browserVersion == 2)
  {
    totalHeight = 0
    for (i=0; i < this.nChildren; i++)
      totalHeight = totalHeight + this.children[i].navObj.clip.height
      subEntries = this.subEntries()
    if (this.isOpen)
      totalHeight = 0 - totalHeight
    for (fIt = this.id + subEntries + 1; fIt < nEntries; fIt++)
      indexOfEntries[fIt].navObj.moveBy(0, totalHeight)
  }
  this.isOpen = isOpen
  propagateChangesInState(this)
}

function propagateChangesInState(folder)
{
  var i=0

  if (folder.isOpen)
  {
    if (folder.nodeImg)
      if (folder.isLastNode)
        folder.nodeImg.src = "images/ftv2mlastnode.gif"
      else
	  folder.nodeImg.src = "images/ftv2mnode.gif"
    folder.iconImg.src = "images/down.gif"
    for (i=0; i<folder.nChildren; i++)
      folder.children[i].display()
  }
  else
  {
    if (folder.nodeImg)
      if (folder.isLastNode)
        folder.nodeImg.src = "images/ftv2plastnode.gif"
      else
	  folder.nodeImg.src = "images/ftv2pnode.gif"
    folder.iconImg.src = "images/normal.gif"
    for (i=0; i<folder.nChildren; i++)
      folder.children[i].hide()
  }
}

function hideFolder()
{
  if (browserVersion == 1) {
    if (this.navObj.style.display == "none")
      return
    this.navObj.style.display = "none"
  } else {
    if (this.navObj.visibility == "hiden")
      return
    this.navObj.visibility = "hiden"
  }

  this.setState(0)
}

function initializeFolder(level, lastNode, leftSide)
{
var j=0
var i=0
var numberOfFolders
var numberOfDocs
var nc

  nc = this.nChildren

  this.createIndex()

  var auxEv = ""

  if (browserVersion > 0)
    auxEv = "<a href='javascript:clickOnNode("+this.id+")'>"
  else
    auxEv = "<a>"

  if (level>0)
    if (lastNode) //the last 'brother' in the children array
    {
      this.renderOb(leftSide + auxEv + "<img name='nodeIcon" + this.id + "' src='images/ftv2mlastnode.gif' width=16 height=22 border=0></a>")
      leftSide = leftSide + "<img src='images/ftv2blank.gif' width=16 height=22>"
      this.isLastNode = 1
    }
    else
    {
      this.renderOb(leftSide + auxEv + "<img name='nodeIcon" + this.id + "' src='images/ftv2mnode.gif' width=16 height=22 border=0></a>")
      leftSide = leftSide + "<img src='images/ftv2vertline.gif' width=16 height=22>"
      this.isLastNode = 0
    }
  else
    this.renderOb("")

  if (nc > 0)
  {
    level = level + 1
    for (i=0 ; i < this.nChildren; i++)
    {
      if (i == this.nChildren-1)
        this.children[i].initialize(level, 1, leftSide)
      else
        this.children[i].initialize(level, 0, leftSide)
      }
  }
}

function drawFolder(leftSide)
{
  if (browserVersion == 2) {
    if (!doc.yPos)
      doc.yPos=8
    doc.write("<layer id='folder" + this.id + "' top=" + doc.yPos + " visibility=hiden>")
  }

  doc.write("<table ")
  if (browserVersion == 1)
    doc.write(" id='folder" + this.id + "' style='position:block;' ")
  doc.write(" border=0 cellspacing=0 cellpadding=0>")
  doc.write("<tr><td>")
  doc.write(leftSide)
  this.outputLink()
  doc.write("<img name='folderIcon" + this.id + "' ")
  doc.write("src='" + this.iconSrc+"' border=0></a>")
  doc.write("</td><td valign=middle nowrap class=menu>")
  if (USETEXTLINKS)
  {
    this.outputLink()
    doc.write(this.desc + "</a>")
  }
  else
    doc.write(this.desc)
  doc.write("</td>")
  doc.write("</table>")

  if (browserVersion == 2) {
    doc.write("</layer>")
  }

  if (browserVersion == 1) {
    this.navObj = doc.all["folder"+this.id]
    this.iconImg = doc.all["folderIcon"+this.id]
    this.nodeImg = doc.all["nodeIcon"+this.id]
  } else if (browserVersion == 2) {
    this.navObj = doc.layers["folder"+this.id]
    this.iconImg = this.navObj.document.images["folderIcon"+this.id]
    this.nodeImg = this.navObj.document.images["nodeIcon"+this.id]
    doc.yPos=doc.yPos+this.navObj.clip.height
  }
}

function outputFolderLink()
{
  if (this.hreference)
  {
    doc.write("<a href='" + this.hreference + "' TARGET=\"basefrm\" ")
    if (browserVersion > 0)
      doc.write("onClick='javascript:clickOnFolder("+this.id+")'")
    doc.write(">")
  }
  else
    doc.write("<a>")
//  doc.write("<a href='javascript:clickOnFolder("+this.id+")'>")
}

function addChild(childNode)
{
  this.children[this.nChildren] = childNode
  this.nChildren++
  return childNode
}

function folderSubEntries()
{
  var i = 0
  var se = this.nChildren

  for (i=0; i < this.nChildren; i++){
    if (this.children[i].children) //is a folder
      se = se + this.children[i].subEntries()
  }

  return se
}


// Definition of class Item (a document or link inside a Folder)
// *************************************************************

function Item(itemDescription, itemLink) // Constructor
{
  // constant data
  this.desc = itemDescription
  this.link = itemLink
  this.id = -1 //initialized in initalize()
  this.navObj = 0 //initialized in render()
  this.iconImg = 0 //initialized in render()
  this.iconSrc = "images/ftv2doc.gif"

  // methods
  this.initialize = initializeItem
  this.createIndex = createEntryIndex
  this.hide = hideItem
  this.display = display
  this.renderOb = drawItem
  this.totalHeight = totalHeight
}

function hideItem()
{
  if (browserVersion == 1) {
    if (this.navObj.style.display == "none")
      return
    this.navObj.style.display = "none"
  } else {
    if (this.navObj.visibility == "hiden")
      return
    this.navObj.visibility = "hiden"
  }
}

function initializeItem(level, lastNode, leftSide)
{
  this.createIndex()

  if (level>0)
    if (lastNode) //the last 'brother' in the children array
    {
      this.renderOb(leftSide + "<img src='images/ftv2lastnode.gif' width=16 height=22>")
      leftSide = leftSide + "<img src='images/ftv2blank.gif' width=16 height=22>"
    }
    else
    {
      this.renderOb(leftSide + "<img src='images/ftv2node.gif' width=16 height=22>")
      leftSide = leftSide + "<img src='images/ftv2vertline.gif' width=16 height=22>"
    }
  else
    this.renderOb("")
}

function drawItem(leftSide)
{
  if (browserVersion == 2)
    doc.write("<layer id='item" + this.id + "' top=" + doc.yPos + " visibility=hiden>")

  doc.write("<table ")
  if (browserVersion == 1)
    doc.write(" id='item" + this.id + "' style='position:block;' ")
  doc.write(" border=0 cellspacing=0 cellpadding=0>")
  doc.write("<tr><td>")
  doc.write(leftSide)
  doc.write("<a href=" + this.link + ">")
  doc.write("<img id='itemIcon"+this.id+"' ")
  doc.write("src='"+this.iconSrc+"' border=0>")
  doc.write("</a>")
  doc.write("</td><td valign=middle nowrap class=submenu>")
  if (USETEXTLINKS)
    doc.write("<a href=" + this.link + ">" + this.desc + "</a>")
  else
    doc.write(this.desc)
  doc.write("</table>")

  if (browserVersion == 2)
    doc.write("</layer>")

  if (browserVersion == 1) {
    this.navObj = doc.all["item"+this.id]
    this.iconImg = doc.all["itemIcon"+this.id]
  } else if (browserVersion == 2) {
    this.navObj = doc.layers["item"+this.id]
    this.iconImg = this.navObj.document.images["itemIcon"+this.id]
    doc.yPos=doc.yPos+this.navObj.clip.height
  }
}


// Methods common to both objects (pseudo-inheritance)
// ********************************************************

function display()
{
  if (browserVersion == 1)
    this.navObj.style.display = "block"
  else
    this.navObj.visibility = "show"
}

function createEntryIndex()
{
  this.id = nEntries
  indexOfEntries[nEntries] = this
  nEntries++
}

// total height of subEntries open
function totalHeight() //used with browserVersion == 2
{
  var h = this.navObj.clip.height
  var i = 0

  if (this.isOpen) //is a folder and _is_ open
    for (i=0 ; i < this.nChildren; i++)
      h = h + this.children[i].totalHeight()

  return h
}


// Events
// *********************************************************

function clickOnFolder(folderId)
{
  var clicked = indexOfEntries[folderId]

  if (!clicked.isOpen)
    clickOnNode(folderId)

  return

  if (clicked.isSelected)
    return
}

function clickOnNode(folderId)
{
  var clickedFolder = 0
  var state = 0

  clickedFolder = indexOfEntries[folderId]
  state = clickedFolder.isOpen

  clickedFolder.setState(!state) //open<->close
}

function initializeDocument()
{
  if (doc.all)
    browserVersion = 1 //IE4
  else
    if (doc.layers)
      browserVersion = 2 //NS4
    else
      browserVersion = 0 //other

  foldersTree.initialize(0, 1, "")
  foldersTree.display()

  if (browserVersion > 0)
  {
    doc.write("<layer top="+indexOfEntries[nEntries-1].navObj.top+">&nbsp;</layer>")

    // close the whole tree
    clickOnNode(0)
    // open the root folder
    clickOnNode(0)
  }
}

// Auxiliary Functions for Folder-Treee backward compatibility
// *********************************************************

function gFld(description, hreference)
{
  folder = new Folder(description, hreference)
  return folder
}

function gLnk(target, description, linkData)
{
  fullLink = ""

  if (target==0)
  {
    fullLink = "'"+linkData+"' target=\"basefrm\""
  }
  else
  {
    if (target==1)
       fullLink = "'http://"+linkData+"' target=_blank"
    else
       fullLink = "javascript:fFlyTo('"+linkData+"');"
  }
  description = "<a href=javascript:fFlyTo('"+linkData+"')>" + description + "</a>"
  linkItem = new Item(description, fullLink)
  return linkItem
}

function insFld(parentFolder, childFolder)
{
  return parentFolder.addChild(childFolder)
}

function insDoc(parentFolder, document)
{
  parentFolder.addChild(document)
}

// Global variables
// ****************

USETEXTLINKS = 0
indexOfEntries = new Array
nEntries = 0
doc = document
browserVersion = 0
selectedFolder=0

   </script>

	   <script language=javascript>
foldersTree = gFld(" MENU ", null);
//Customer Service
aux1 = insFld(foldersTree , gFld('Customer Complain', null));
insDoc(aux1, gLnk(2, "Customer Complain","CustomerService/CustomerComplain.aspx"));

//Database
aux1 = insFld(foldersTree , gFld('Data Bank', null));
insDoc(aux1, gLnk(2, "Data Bank","Database/Database_List.aspx"));

//Prospect
aux1 = insFld(foldersTree , gFld('Prospect', null));
insDoc(aux1, gLnk(2, "Prospect","Marketing/Prospect/ProspectsCustomer.aspx"));



//Survey Report


// marketing
aux1 = insFld(foldersTree, gFld('Marketing', null));
aux2 = insFld(aux1, gFld("Supplier", null));
insDoc(aux2, gLnk(2, "Supplier Holding","Marketing/Supplier/SupplierHolding.aspx"));
insDoc(aux2, gLnk(2, "Supplier","Marketing/Supplier/Supplier.aspx"));
insDoc(aux2, gLnk(2, "BRE Assignment","Marketing/BREAssignment/SupplierBRE_EmployeeList.aspx"));

aux2 = insFld(aux1, gFld("Assignment Databank", null));
insDoc(aux2, gLnk(2, "Databank Internal","Marketing/Telesales/DataBankInternal.aspx"));
insDoc(aux2, gLnk(2, "Databank External","Marketing/Telesales/DataBankExternal.aspx"));

aux2 = insFld(aux1, gFld("Tele Sales Activity", null));
insDoc(aux2, gLnk(2, "Tele Sales Activity","Marketing/TSEActivity/TSEActivity.aspx"));
insDoc(aux2, gLnk(2, "TSE Supervisor Activity","Marketing/TseActivity/TseSupervisorActivity.aspx"));
insDoc(aux2, gLnk(2, "TSE Supervisor ReAssign","Marketing/TseActivity/TseSupervisorActivityReAssign.aspx"));


aux2 = insFld(aux1, gFld("Setting", null));
aux3 = insFld(aux2, gFld("Marketing Organization", null));
insDoc(aux3, gLnk(2, "Marketing Employee","Marketing/MarketingOrganization/Marketing.aspx"));

aux3 = insFld(aux2, gFld("Tele sales", null));
insDoc(aux3, gLnk(2, "Tele sales","Marketing/Telesales/Telesales.aspx"));

aux3 = insFld(aux1, gFld("Marketing Activity", null));
insDoc(aux3, gLnk(2, "Marketing Activity Allocation","Marketing/MarketingActivity/MarketingActivityAllocation.aspx"));
insDoc(aux3, gLnk(2, "Marketing Activity","Marketing/MarketingActivity/MarketingActivity.aspx"));

aux3 = insFld(aux2, gFld("Asset Maintenance", null));
insDoc(aux3, gLnk(2, "Asset Type","Marketing/AssetMnt/AssetType.aspx"));
insDoc(aux3, gLnk(2, "Asset Master","Marketing/AssetMnt/AssetMaster.aspx"));
insDoc(aux3, gLnk(2, "Asset Price List","Marketing/AssetMnt/AssetPriceList.aspx"));
insDoc(aux3, gLnk(2, "Insurance Asset Category","Marketing/AssetMnt/InsuranceAssetCategory.aspx"));

//Budget 
aux3 = insFld(aux2, gFld("Product Maintenance", null));
insDoc(aux3, gLnk(2, "Product","Marketing/Product/Product.aspx"));
insDoc(aux3, gLnk(2, "Product Branch","Marketing/Product/ProductBranch.aspx"));
insDoc(aux3, gLnk(2, "Product Budget","Marketing/ProductBudget/ProductBudgetListing.aspx"));
insDoc(aux3, gLnk(2, "Product Forecast","Marketing/Productforecast/ProductforecastListing.aspx"));

aux3 = insFld(aux2, gFld("Credit Scoring", null));
insDoc(aux3 , gLnk(2, "Component Scoring Card","Marketing/CreditScoringComponentListing.htm"));
insDoc(aux3 , gLnk(2, "Scoring Card","Marketing/CreditScoreCardScheme.htm"));
aux4 = insFld(aux2, gFld('Credit Investigation', null));
insDoc(aux4, gLnk(2, "Group Component","Marketing/CreditInvestigation/CreditInvestigationGroupMaintenance.htm"));
insDoc(aux4, gLnk(2, "Question List","Marketing/CreditInvestigation/CreditInvestigationQuestionMaintance.htm"));
insDoc(aux4, gLnk(2, "Scheme","Marketing/CreditInvestigation/CreditInvestigationSchemeMaintance.htm"));
insDoc(aux2, gLnk(2, "Admin Fee","Marketing/AdminFee/AdminFee.aspx"));
insDoc(aux2 , gLnk(2, "General Setting","Marketing/GeneralSetting.htm"));

aux2 = insFld(aux1, gFld("Others", null));
insDoc(aux2, gLnk(2, "Download Sales Data","Marketing/Supplier/DownloadSalesData.aspx"));

aux2 = insFld(aux1, gFld("Report", null));
insDoc(aux2, gLnk(2, "Supplier Incentive","Marketing/Supplier/RptSupplierIncentiveInputParameter.aspx"));

// credit
aux1 = insFld(foldersTree, gFld('Account Acquisition', null));
aux2 = insFld(aux1, gFld("Customer", null));
insDoc(aux2 , gLnk(2, "Customer","SurveyReport/Customer.aspx"));
insDoc(aux2, gLnk(2, "Negative Customer","Marketing/NegativeList.htm"));
//Additional Collateral
aux3 = insFld(aux2, gFld("Additional Collateral", null));
insDoc(aux3, gLnk(2, "Receive","Credit/AdditionalCollateral/AdditionalCollateralReceive.aspx"));
aux4 = insFld(aux3, gFld("Release", null));
insDoc(aux4, gLnk(2, "Release Request","Credit/AdditionalCollateral/AdditionalCollateralRelease.aspx"));
insDoc(aux4, gLnk(2, "Approval","Credit/AdditionalCollateral/ReleaseAdditionalCollateralApproval.htm"));

// Zuma
aux2 = insFld(aux1, gFld("Zuma Application", null));
insDoc(aux2, gLnk(2, "Zuma Data","surveyreport/DEMotor/SurveyReportDEMotorZumaDataList.aspx"));
insDoc(aux2, gLnk(2, "Application Data","surveyreport/DEMotor/SurveyReportDEMotorZumaApplicationDataList.aspx"));
insDoc(aux2, gLnk(2, "Asset Data","surveyreport/DEMotor/SurveyReportDEMotorZumaAssetDataList.aspx"));


aux2 = insFld(aux1, gFld("Survey Report", null));

// DE Motor
aux3 = insFld(aux2, gFld('DE Motor', null));
insDoc(aux3, gLnk(2, "Survey Report DE Motor","surveyreport/DEMotor/SurveyReportDEMotorApplicationDataList.aspx"));
insDoc(aux3, gLnk(2, "New Asset","surveyreport/DEMotor/SurveyReportDEMotorAssetDataList.aspx"));
insDoc(aux3, gLnk(2, "Financial Structure","surveyreport/DEMotor/SurveyReportDEMotorFinancialDataList.aspx"));
insDoc(aux3, gLnk(2, "Commission DE Motor","surveyreport/DEMotor/SurveyReportDEMotorCommissionDataList.aspx"));
insDoc(aux3, gLnk(2, "Other Data DE Motor","surveyreport/DEMotor/SurveyReportDEMotorOtherDataList.aspx"));

// DE Mobil
aux3 = insFld(aux2, gFld('KCM', null));
insDoc(aux3, gLnk(2, "New Survey Report","surveyreport/CF/SurveyReport_CF_ApplicationDataList.aspx"));
insDoc(aux3, gLnk(2, "New Asset","surveyreport/CF/SurveyReport_CF_AssetDataList.aspx"));
insDoc(aux3, gLnk(2, "New Insurance","surveyreport/CF/SurveyReport_CF_InsuranceDataList.aspx"));
insDoc(aux3, gLnk(2, "New Financial Data","surveyreport/CF/SurveyReport_CF_FinancialDataList.aspx"));
insDoc(aux3, gLnk(2, "New Commision Data","surveyreport/CF/SurveyReport_CF_CommisionDataList.aspx"));
insDoc(aux3, gLnk(2, "New Other Data","surveyreport/CF/SurveyReport_CF_OtherDataList.aspx"));

// Leasing

// Leasing

aux3 = insFld(aux2, gFld('Marketing Memo', null));
insDoc(aux3, gLnk(2, "Application Data","SurveyReport/Leasing/MarketingMemoLS.aspx"));
insDoc(aux3, gLnk(3, "Asset Data","SurveyReport/Leasing/MarketingMemoLS2.aspx"));
insDoc(aux3, gLnk(4, "Insurance Data","SurveyReport/Leasing/MarketingMemoLS3.aspx"));
insDoc(aux3, gLnk(5, "Financial Data","SurveyReport/Leasing/MarketingMemoLS4.aspx"));
insDoc(aux3, gLnk(6, "Commission Data","SurveyReport/Leasing/MarketingMemoLS5.aspx"));
insDoc(aux3, gLnk(7, "Other Data","SurveyReport/Leasing/MarketingMemoLS6.aspx"));
//insDoc(aux2, gLnk(2, "Phone Verification","Marketing/ProspectsCustomer.aspx"));



aux2 = insFld(aux1, gFld("Credit Process", null));
insDoc(aux2, gLnk(2, "Credit Investigation","Credit/AgreementListCreditInvestigation.htm"));
insDoc(aux2, gLnk(2, "Credit Scoring","Credit/CreditScoring.aspx"));
insDoc(aux2, gLnk(2, "Credit Checking","Credit/WorkSheetCA/WorksheetCA_AgreementList.aspx"));
insDoc(aux2, gLnk(2, "Request For Credit Approval","Credit/RequestForCredit.htm"));
insDoc(aux2, gLnk(2, "Approval","Credit/Approval.htm"));
insDoc(aux2, gLnk(2, "Pledge To Funding Company","Credit/AgreementSelectionToFunding.htm"));
insDoc(aux2, gLnk(2, "Request For Prospect Funding","Credit/RequestForFunding.aspx"));
insDoc(aux2, gLnk(2, "Document Signer Registration","Credit/PriorToPo/PriorToPo_AgreementList.aspx"));
insDoc(aux2, gLnk(2, "Purchase Order","Credit/PurchaseOrder.aspx"));
insDoc(aux2, gLnk(2, "Delivery order","Credit/DeliveryOrder.htm"));
insDoc(aux2, gLnk(2, "Insurance Activation","Credit/InsuranceActivation.aspx"));
insDoc(aux2, gLnk(2, "Invoice","Credit/Invoice.htm"));
insDoc(aux2, gLnk(2, "Go Live","Credit/GoLive.htm"));


aux3 = insFld(aux2, gFld("Additional Proses", null));

insDoc(aux3, gLnk(2, "Complete Data Entry","Credit/CompletedataEntry/CompleteDataEntryList.aspx"));


//Additional Term & Condition
aux4 = insFld(aux3, gFld("Term & Condition", null));
insDoc(aux4, gLnk(2, "Additional Term & Condition","Credit/AdditionalTC/AgreementAdditionalTC.aspx"));
insDoc(aux4, gLnk(2, "Pending Term & Condition","Credit/PendingTC/PendingTC.aspx"));

//Documents
insDoc(aux1 , gLnk(2, "Documents","Credit/DocumentList.aspx"));

aux2 = insFld(aux1, gFld("MOU", null));
insDoc(aux2, gLnk(2, "MOU Maintenance","MOU/MouList.aspx"));
insDoc(aux2, gLnk(2, "MOU Approval","MOU/MouApproval.htm"));
insDoc(aux2, gLnk(2, "MOU Activation","MOU/MouActivation.aspx"));

// Finance
aux1 = insFld(foldersTree, gFld('Finance', null));
aux2 = insFld(aux1, gFld("AP Disbursement", null));
insDoc(aux2, gLnk(2, "AP Disbursement Selection","Finance/APSelection.htm"));
insDoc(aux2, gLnk(2, "AP Disbursement Approval","Finance/APApproval.htm"));
insDoc(aux2, gLnk(2, "Payment Listing To Bank","Finance/AccountPayable/PaymentListingToBankAwal.aspx"));
aux3 = insFld(aux2, gFld("Disbursement", null));
insDoc(aux3, gLnk(2, "AP Cash Disbursement","Finance/APCash.htm"));
insDoc(aux3, gLnk(2, "AP Bank Disbursement","Finance/APBank.htm"));
aux3 = insFld(aux2, gFld("Inquiry", null));
insDoc(aux3, gLnk(2, "AP Inquiry","Finance/APInquiry.htm"));
insDoc(aux3, gLnk(2, "Payment Voucher Inquiry","Finance/PaymentVoucherInquiry.htm"));
aux3 = insFld(aux2, gFld("Report", null));
insDoc(aux3, gLnk(2, "Funding Request Summary Report","Finance/AccountPayable/Report/RptFundingRequestSummaryInputParameter.aspx"));
aux3 = insFld(aux2, gFld("Others", null));
insDoc(aux3, gLnk(2, "Status AP Payment To Dealer Download Data","Finance/AccountPayable/StatusAPPaymentToDealerDownloadData.aspx"));


aux2 = insFld(aux1, gFld("Transfer Fund", null));
insDoc(aux2, gLnk(2, "Transfer Account","Finance/TransferAccount.htm"));
insDoc(aux2, gLnk(2, "Transfer Fund InterBranch","Finance/TransferFund.htm"));
insDoc(aux2, gLnk(2, "Transfer for Reimburse PC","Finance/TransferPettyCashReimburse.htm"));
insDoc(aux2, gLnk(2, "Transfer Petty Cash Advance","Finance/TransferPettyCashAdvance.aspx"));
insDoc(aux2, gLnk(2, "Transfer Fund Reconcile","Finance/TransferFundReconcile.htm"));
insDoc(aux2, gLnk(2, "Transfer Fund For Prospect Funding","Finance/TransferRequestForFunding.aspx"));
insDoc(aux2, gLnk(2, "Transfer Fund Inquiry","Finance/TransferFundInquiry.htm"));
aux2 = insFld(aux1, gFld("Prospect Funding", null));
insDoc(aux2, gLnk(2, "Reconcile Prospect Funding","Finance/RequestForFundingReconcile.aspx"));
insDoc(aux2, gLnk(2, "Reversal Prospect Funding","Finance/RequestForFundingReversal.aspx"));
aux2 = insFld(aux1, gFld("Other Transactions", null));
insDoc(aux2, gLnk(2, "Other Receive","Finance/OtherReceiveNonAgreement.htm"));
insDoc(aux2, gLnk(2, "Other Disburse","Finance/OtherPaymentNonAgreement.htm"));
insDoc(aux1, gLnk(2, "Bank Reconcile","Finance/BankReconcile.htm"));
aux2 = insFld(aux1, gFld("Print", null));
insDoc(aux2, gLnk(2, "Order of Transfer","Finance/OrderOfTransfer.htm"));


aux1 = insFld(foldersTree, gFld('Treasury', null));
insDoc(aux1, gLnk(2, "Funding Source","ChannelSecurity/FundingSource.htm"));
aux2 = insFld(aux1, gFld("Term Loan", null));
insDoc(aux2 , gLnk(2, "Funding Contract","ChannelSecurity/FundingSourceContractTLSearch.htm"));
insDoc(aux2 , gLnk(2, "Funding Agreement","ChannelSecurity/FundingAgreementTL.htm"));
insDoc(aux2 , gLnk(2, "Execution","ChannelSecurity/ExecutionContracttTL.htm"));
insDoc(aux2 , gLnk(2, "Draw Down","ChannelSecurity/DrawdownBatchTL.htm"));
insDoc(aux2 , gLnk(2, "Payment Out","ChannelSecurity/PaymentOutBatchTL.htm"));
aux3 = insFld(aux2, gFld("Report", null));
insDoc(aux3 , gLnk(2, "Drawdown Batch Report ","ChannelSecurity/DrawdownReport.htm"));

// Joint Finance Channelling
aux2 = insFld(aux1, gFld("Joint Finance and Channelling", null));
insDoc(aux2, gLnk(2, "Funding Contract","ChannelSecurity/JointFinance/FundingSourceContractJFSearch.htm"));
insDoc(aux2, gLnk(2, "Funding Plafond Customer","ChannelSecurity/JointFinance/FundingPlafondCustomerListing.htm"));
insDoc(aux2, gLnk(2, "Pledging After GoLive","ChannelSecurity/JointFinance/FundingAgreementJF.htm"));
insDoc(aux2, gLnk(2, "Change Batch","ChannelSecurity/JointFinance/FundingContractChangeBatchJF.htm"));
insDoc(aux2, gLnk(2, "Pledge Release","ChannelSecurity/JointFinance/FundingPledgeReleaseJF.htm"));
insDoc(aux2, gLnk(2, "Draw Down","ChannelSecurity/JointFinance/DrawdownBatchJF.htm"));
insDoc(aux2, gLnk(2, "UnDraw","ChannelSecurity/JointFinance/FundingUnDrawJF.htm"));

//aux4 = insFld(aux3 , gFld("Before Go Live", null));
//insDoc(aux4 , gLnk(2, "Execution","ChannelSecurity/ExecutionContracttJFBefore.htm"));

//aux5 = insFld(aux3 , gFld("After Go Live", null));
//insDoc(aux5 , gLnk(2, "Funding Agreement","ChannelSecurity/FundingAgreementJF.htm"));
//insDoc(aux5 , gLnk(2, "Execution","ChannelSecurity/ExecutionContracttJF.htm"));

aux6 = insFld(aux2, gFld("Payment Out", null));
aux7 = insFld(aux6 , gFld("Installment Mirroring", null));
insDoc(aux7 , gLnk(2, "Prepare","ChannelSecurity/JointFinance/FundingPaymentOutJFMirror.htm"));
//insDoc(aux7 , gLnk(2, "Generate Text File - Payment","ChannelSecurity/JointFinance/FundingPaymentOutJFMirrorTextFile.htm"));
insDoc(aux7 , gLnk(2, "Execute","ChannelSecurity/JointFinance/FundingPaymentOutJFMirrorExecute.htm"));
insDoc(aux7 , gLnk(2, "Inquiry","ChannelSecurity/JointFinance/FundingPaymentOutJFInquiry.htm"));
aux8 = insFld(aux6 , gFld("Installment Non Mirroring", null));
insDoc(aux8 , gLnk(2, "Prepare","ChannelSecurity/JointFinance/FundingPaymentOutJF.htm"));
insDoc(aux8 , gLnk(2, "Execute","ChannelSecurity/JointFinance/FundingPaymentOutJFExecute.htm"));
insDoc(aux8 , gLnk(2, "Inquiry","ChannelSecurity/JointFinance/FundingPaymentOutJFInquiry.htm"));
aux4 = insFld(aux6 , gFld("Late Charges", null));
insDoc(aux4 , gLnk(2, "Prepare","ChannelSecurity/PaymentOutBatchJF.htm"));
//insDoc(aux4 , gLnk(2, "Generate Text File - Payment LC","ChannelSecurity/ExecutePaymentOutBatchJFMirror.htm"));
insDoc(aux4 , gLnk(2, "Execute","ChannelSecurity/ExecutePaymentOutBatchJF.htm"));
insDoc(aux4 , gLnk(2, "Inquiry","ChannelSecurity/ExecutePaymentOutBatchJF.htm"));

insDoc(aux6 , gLnk(2, "Fees","ChannelSecurity/JointFinance/FundingPaymentOutFeesJF.htm"));
insDoc(aux6 , gLnk(2, "LC By Funding","ChannelSecurity/JointFinance/FundingLateChargeByFundingJF.htm"));

insDoc(aux6 , gLnk(2, "Reversal","ChannelSecurity/JointFinance/FundingPaymentOutReversalJF.htm"));
insDoc(aux6 , gLnk(2, "Reversal Per Agreement","ChannelSecurity/JointFinance/FundingPaymentOutReversalPerAgrJF.htm"));

aux5 = insFld(aux3 , gFld("Early Termination", null));
insDoc(aux5 , gLnk(2, "Prepare","ChannelSecurity/JointFinance/FundingETPrepareJF.htm"));
insDoc(aux5 , gLnk(2, "Execute","ChannelSecurity/JointFinance/FundingETExecutionJF.htm"));
insDoc(aux5 , gLnk(2, "Inquiry","ChannelSecurity/JointFinance/FundingETInquiryJF.htm"));

aux9 = insFld(aux3 , gFld("Buy Back", null));
insDoc(aux9 , gLnk(2, "Prepare","ChannelSecurity/JointFinance/FundingBuyBackJF.htm"));
insDoc(aux9 , gLnk(2, "Execution","ChannelSecurity/JointFinance/FundingBuyBackExecutionJF.htm"));
aux10 = insFld(aux3 , gFld("Other Transaction", null));
insDoc(aux10 , gLnk(2, "Other Transaction","ChannelSecurity/JointFinance/FundingOtherTransJF.htm"));
insDoc(aux10 , gLnk(2, "Inquiry","ChannelSecurity/JointFinance/FundingOtherTransJFInquiry.htm"));

aux13 = insFld(aux3 , gFld("Report", null));


//Placement

aux2 = insFld(aux1, gFld('Placement', null));
insDoc(aux2, gLnk(2, "Bank Registration","Placement/BankRegistration.htm"));
insDoc(aux2, gLnk(2, "Time Deposit Registration","Placement/TDRegistration.htm"));
insDoc(aux2, gLnk(2, "Time Deposit Execution","Placement/TDExecution.htm"));
insDoc(aux2, gLnk(2, "Time Deposit Transactions","Placement/TDTransaction.htm"));
insDoc(aux2, gLnk(2, "Time Deposit Transactions Reverse","Placement/TDTransactionReverse.htm"));
insDoc(aux2, gLnk(2, "Manual Roll Over","Placement/TDManualRO.htm"));
insDoc(aux2, gLnk(2, "Break","Placement/TDTermination.htm"));
insDoc(aux2, gLnk(2, "Closing","Placement/TDClosing.htm"));
aux3 = insFld(aux2, gFld("Inquiry & Reports", null));
aux4 = insFld(aux3, gFld("Inquiry", null));
insDoc(aux4, gLnk(2, "Time Deposit Monitoring","Placement/InqTDMonitoring.htm"));
insDoc(aux4, gLnk(2, "Time Deposit Expired","Placement/InqTDExpired.htm"));
insDoc(aux4, gLnk(2, "Interest Income","Placement/InqTDInterestIncome.htm"));
insDoc(aux4, gLnk(2, "Interest Accrued","Placement/InqTDInterestIncomeAccrued.htm"));

aux4 = insFld(aux3, gFld("Reports", null));
insDoc(aux4, gLnk(2, "Time Deposit Monitoring","Placement/AgreementOverNegCov.htm"));
insDoc(aux4, gLnk(2, "Time Deposit Expired","Placement/PrepaidAgreement.htm"));
insDoc(aux4, gLnk(2, "Interest Income","Placement/DrawdownUnfulfilledSecurity.htm"));
insDoc(aux4, gLnk(2, "Interest Accrued","Placement/DrawdownUnfulfilledSecurity.htm"));

//Money Market
aux2 = insFld(aux1, gFld('Money Market', null));
insDoc(aux2, gLnk(2, "Depositor Registration","Placement/DepositorRegistration.htm"));
insDoc(aux2, gLnk(2, "Money Market Registration","Placement/MoneyMarketRegistration.htm"));
insDoc(aux2, gLnk(2, "Money Market Execution","Placement/MoneyMarketExecution.htm"));
insDoc(aux2, gLnk(2, "Money Market Transactions","Placement/MoneyMarketTransaction.htm"));
insDoc(aux2, gLnk(2, "Money Market Transactions Reverse","Placement/MoneyMarketTransactionReverse.htm"));
insDoc(aux2, gLnk(2, "Manual Roll Over","Placement/MoneyMarketManualRO.htm"));
insDoc(aux2, gLnk(2, "Break","Placement/MoneyMarketTermination.htm"));
insDoc(aux2, gLnk(2, "Closing","Placement/MoneyMarketClosing.htm"));
//aux3 = insFld(aux2, gFld("Inquiry & Reports", null));
//aux4 = insFld(aux3, gFld("Inquiry", null));
//insDoc(aux4, gLnk(2, "Money Market Monitoring","Placement/InqMoneyMarketMonitoring.htm"));
//insDoc(aux4, gLnk(2, "Money Market Expired","Placement/InqMoneyMarketExpired.htm"));
//insDoc(aux4, gLnk(2, "Interest Income","Placement/InqMoneyMarketInterestIncome.htm"));
//insDoc(aux4, gLnk(2, "Interest Accrued","Placement/InqMoneyMarketInterestIncomeAccrued.htm"));
//Bond (Obligasi)

aux2 = insFld(aux1, gFld("Bond Facility", null));
insDoc(aux2 , gLnk(2, "Funding Contract","ChannelSecurity/BondFacility/FundingSourceContractBond.aspx"));
insDoc(aux2 , gLnk(2, "Funding Agreement","ChannelSecurity/BondFacility/FundingAgreementBond.aspx"));
insDoc(aux2 , gLnk(2, "Draw Down","ChannelSecurity/BondFacility/DrawdownBatchBond.aspx"));
insDoc(aux2 , gLnk(2, "Payment Out","ChannelSecurity/BondFacility/PaymentOutBatchBond.aspx"));
insDoc(aux2 , gLnk(2, "Buy Back obligasi","ChannelSecurity/BondFacility/BuyBackBond.aspx"));
//insDoc(aux2 , gLnk(2, "Sell Back","ChannelSecurity/BondFacility/SellBackBond.aspx"));


// Insurance
aux1 = insFld(foldersTree, gFld('Insurance', null));

insDoc(aux1, gLnk(2, "SPPA","Insurance/SPPA.aspx"));
insDoc(aux1, gLnk(2, "Change Insco","Insurance/ChangeInsco.aspx"));
insDoc(aux1, gLnk(2, "Policy Receive","Insurance/PolicyReceiving.htm"));
insDoc(aux1, gLnk(2, "Edit Policy Receive","Insurance/EditPolicyReceiving.htm"));
insDoc(aux1, gLnk(2, "Insurance Billing","Insurance/InsuranceBillingSearch.aspx"));
insDoc(aux1, gLnk(2, "Print Insurance Billing","Insurance/PrintBilling.aspx"));
//aux2 = insFld(aux1, gFld("Endorsment", null));
insDoc(aux1, gLnk(2, "Endorsment Premi","Insurance/EndorsmentRequest.aspx"));
//insDoc(aux2, gLnk(2, "Endorsment Data","Insurance/EndorsmentData.htm"));
//insDoc(aux1, gLnk(2, "Edit Inslength","Insurance/EditInslength.htm"));
//insDoc(aux1, gLnk(2, "Endorsment Rescheduling","Insurance/EndorsmentRequestResch.htm"));
insDoc(aux1, gLnk(2, "Renewal Letter Print","Insurance/RenewalPrint.htm"));
//insDoc(aux1, gLnk(2, "Edit Coverage For Renewal","Insurance/InsuranceRenewal.htm"));
insDoc(aux1, gLnk(2, "Insurance Renewal","Insurance/Renewal/InsuranceRenewal.aspx"));

aux2 = insFld(aux1, gFld("Claim", null));
insDoc(aux2, gLnk(2, "Claim Request","Insurance/Claim/ClaimRequest.aspx"));
insDoc(aux2, gLnk(2, "Claim Activity","Insurance/Claim/ClaimActivity.aspx"));
insDoc(aux2, gLnk(2, "Claim Reject","Insurance/Claim/ClaimActivityRejectList.aspx"));
insDoc(aux2, gLnk(2, "Print Claim Form","Insurance/Claim/ClaimPrintReportList.aspx"));


aux2 = insFld(aux1, gFld("Setting", null));

insDoc(aux2, gLnk(2, "Insurance Premium to Customer","Insurance/InsurancePremiumToCustomerSetting.aspx"));
insDoc(aux2, gLnk(2, "Insurance Company & Branch","Insurance/InsuranceCompanySetting.aspx"));
insDoc(aux2, gLnk(2, "Life Insurance","Insurance/LifeInsuranceCompanySetting.aspx"));
insDoc(aux2, gLnk(2, "Insurance Quota","Insurance/InsuranceQuoteSetting.htm"));
insDoc(aux2, gLnk(2, "Insurance Document","Insurance/InsuranceDocumentSetting.htm"));
insDoc(aux2, gLnk(2, "Insurance Claim Document","Insurance/InsuranceClaimDocumentSetting.htm"));
insDoc(aux2, gLnk(2, "General Setting","Insurance/GeneralSetting.htm"));


aux1 = insFld(foldersTree, gFld('Account Maintenance', null));
aux2 = insFld(aux1, gFld("Cashier", null));
insDoc(aux2, gLnk(2, "Open/Close Cashier", "AccMaintenance/OpenCloseCashier.htm"));

aux3 = insFld(aux2, gFld("Petty Cash", null));
aux4 = insFld(aux3, gFld("Petty Cash Transaction", null));
insDoc(aux4, gLnk(2, "Petty Cash Transaction", "AccMaintenance/PettyCash/PettyCashTransaction.htm"));
insDoc(aux4, gLnk(2, "Petty Cash Reversal", "AccMaintenance/PettyCash/PettyCashReversal.htm"));
insDoc(aux4, gLnk(2, "Petty Cash Inquiry", "AccMaintenance/PettyCash/PettyCashInquiry.htm"));
aux4 = insFld(aux3, gFld("Petty Cash Reimburse", null));
insDoc(aux4, gLnk(2, "Request", "AccMaintenance/PettyCash/PettyCashReimburse.htm"));
insDoc(aux4, gLnk(2, "Reconcile", "AccMaintenance/PettyCash/PettyCashReimburseReconcile.htm"));
insDoc(aux4, gLnk(2, "Inquiry", "AccMaintenance/PettyCash/PettyCashReimburseInquiry.htm"));

aux3 = insFld(aux2, gFld("Petty Cash Advance", null));
insDoc(aux3, gLnk(2, "Request", "AccMaintenance/PettyCashAdvance/AdvanceRequest.aspx"));
insDoc(aux3, gLnk(2, "Approval", "AccMaintenance/PettyCashAdvance/AdvanceRequestApproval.aspx"));
insDoc(aux3, gLnk(2, "Reconcile", "AccMaintenance/PettyCashAdvance/AdvanceRequestReconcileList.aspx"));
insDoc(aux3, gLnk(2, "Return", "AccMaintenance/PettyCashAdvance/AdvanceReturnSearch.aspx"));
insDoc(aux3, gLnk(2, "Inquiry", "AccMaintenance/PettyCashAdvance/AdvanceInquiry.aspx"));

aux3 = insFld(aux2, gFld("PDC Maintenance", null));
insDoc(aux3, gLnk(2, "PDC Receive","AccMaintenance/AgreementMultiPDC.htm"));
insDoc(aux3, gLnk(2, "Receive PDC Multi Transaction","AccMaintenance/AgreementMultiPDCTrans.htm"));
insDoc(aux3, gLnk(2, "Receive PDC Multi Agreement","AccMaintenance/PDCMultiAgreement.htm"));
insDoc(aux3, gLnk(2, "Request PDC To Deposit","AccMaintenance/PDCRequestToDeposit.htm"));
insDoc(aux3, gLnk(2, "PDC To Deposit","AccMaintenance/PDCToDeposit.htm"));
insDoc(aux3, gLnk(2, "PDC Post Clear Reconcile","AccMaintenance/PDCPostClearReconcile.htm"));
insDoc(aux3, gLnk(2, "PDC Clear Reconcile (Inkaso)","AccMaintenance/PDCReconcileClear.htm"));
insDoc(aux3, gLnk(2, "PDC Bounce Reconcile (Inkaso)","AccMaintenance/PDCReconcileBounce.htm"));
//insDoc(aux3, gLnk(2, "PDC Allocation","AccMaintenance/PDCAllocation.htm"));
//aux4 = insFld(aux3, gFld("PDC Reconcile", null));
aux4 = insFld(aux3, gFld("Additional Process", null));
insDoc(aux4, gLnk(2, "Change PDC Status","AccMaintenance/PDCChangeStatus.htm"));
insDoc(aux4, gLnk(2, "Edit PDC","AccMaintenance/PDCEdit.htm"));
//insDoc(aux4, gLnk(2, "Approval","AccMaintenance/PDCChangeStatusApproval.htm"));
insDoc(aux4, gLnk(2, "PDC Return","AccMaintenance/PDCReturn.htm"));
aux4 = insFld(aux3, gFld("Inquiry", null));
insDoc(aux4, gLnk(2, "PDC Receipt Inquiry","AccMaintenance/PDCReceiptInquiry.htm"));
insDoc(aux4, gLnk(2, "PDC Status Inquiry","AccMaintenance/PDCInquiry.htm"));
insDoc(aux4, gLnk(2, "PDC Incomplete","AccMaintenance/PDCIncomplete.htm"));
insDoc(aux4, gLnk(2, "PDC to Deposit","AccMaintenance/PDCToDepositBank.htm"));
aux3 = insFld(aux2, gFld("Receive from Customer", null));
insDoc(aux3, gLnk(3, "Payment Receive", "AccMaintenance/PaymentReceive/PaymentReceiveWayOfPayment.aspx"));
insDoc(aux3, gLnk(3, "Payment Reversal","AccMaintenance/AgreementPaymentReversal.htm"));
insDoc(aux3, gLnk(3, "Prepaid Settlement","AccMaintenance/PrepaidSettlement/PrepaidSettlementAgreementList.aspx"));
insDoc(aux3, gLnk(2, "TDP Amount Receive", "AccMaintenance/TDP/TDPList.aspx"));
aux3 = insFld(aux2, gFld("Suspend Account", null));
insDoc(aux3, gLnk(2, "Suspend Receive","AccMaintenance/SuspendReceive.htm"));
insDoc(aux3, gLnk(2, "Suspend Reversal","AccMaintenance/SuspendReversal.htm"));
insDoc(aux3, gLnk(2, "Suspend Allocation","AccMaintenance/SuspendAllocation.htm"));
insDoc(aux3, gLnk(2, "Suspend Inquiry","AccMaintenance/SuspendInquiry.htm"));


aux3 = insFld(aux2, gFld("Other Transactions", null));
insDoc(aux3, gLnk(2, "Credit Card Reconcile", "AccMaintenance/CreditCard/CreditCardTransactionList.aspx"));
insDoc(aux3, gLnk(2, "Credit Card Reconcile Correction", "AccMaintenance/CreditCard/CreditCardTransactionCorrectionnList.aspx"));
insDoc(aux3, gLnk(2, "Insurance Claim Receive", "AccMaintenance/InsuranceClaimReceive.aspx"));

aux2 = insFld(aux1, gFld("Amendment", null));
aux3 = insFld(aux2, gFld("Prepayment", null));
insDoc(aux3, gLnk(2, "Calculation","AccMaintenance/Prepayment/PrepaymentCalculation.aspx"));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/Prepayment/AgreementPrepayment.aspx"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/Prepayment/PrepaymentApproval.aspx"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/Prepayment/PrepaymentExecution.aspx"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/Prepayment/PrepaymentInquiry.aspx"));
aux3 = insFld(aux2, gFld("Prepayment Without RRD", null));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/PrepaymentWithoutRRD/PrepaymentWithoutRRDAgreementList.aspx"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/PrepaymentWithoutRRD/PrepaymentWithoutRRDApproval.aspx"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/PrepaymentWithoutRRD/PrepaymentWithoutRRDExecutionList.aspx"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/PrepaymentWithoutRRD/PrepaymentWithoutRRDInquiry.aspx"));

aux3 = insFld(aux2, gFld("Partial Asset Prepayment", null));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/AgreementPartialPrepayment.htm"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/PartialAssetPrepaymentApproval.htm"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/PartialPrepaymentExecution.htm"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/PartialPrepaymentInquiry.htm"));
aux3 = insFld(aux2, gFld("Asset Release", null));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/AgreementPartialRelease.htm"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/PartialReleaseApproval.htm"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/PartialReleaseExecution.htm"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/PartialReleaseInquiry.htm"));
aux3 = insFld(aux2, gFld("Due Date Change", null));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/DueDateChange.htm"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/DueDateChangeApproval.htm"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/DueDateChangeExecution.htm"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/DueDateChangeInquiry.htm"));
aux3 = insFld(aux2, gFld("Rescheduling", null));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/AgreementRescheduling.htm"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/ReschedulingApproval.htm"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/AgreementReschedulingExecution.htm"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/AgreementReschedulingInquiry.htm"));

aux3 = insFld(aux2, gFld("Additional Funding", null));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/AdditionalFunding/AdditionalFunding.aspx"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/AdditionalFunding/AdditionalFundingApproval.aspx"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/AdditionalFunding/AdditionalFundingExecution.aspx"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/AdditionalFunding/AdditionalFundingInquiry.aspx"));

aux3 = insFld(aux2, gFld("Asset Replacement", null));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/AgreementAssetReplacement.htm"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/AssetReplacementApproval.htm"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/AssetReplacementExecution.htm"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/AssetReplacementInquiry.htm"));
aux3 = insFld(aux2, gFld("Floating Adjustment", null));
insDoc(aux3, gLnk(2, "Review","AccMaintenance/AgreementFloatingAdjustment.htm"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/AgreementFloatingInquiry.htm"));
aux2 = insFld(aux1, gFld("Refund to Customer", null));
insDoc(aux2, gLnk(2, "Request","AccMaintenance/AgreementRefundToCustomer.htm"));
insDoc(aux2, gLnk(2, "Approval","AccMaintenance/RefundToCustomerApproval.htm"));
insDoc(aux2, gLnk(2, "Inquiry","AccMaintenance/RefundToCustomerInquiry.htm"));



aux2 = insFld(aux1, gFld("NPL and Write Off Contract", null));
aux3 = insFld(aux2, gFld("NPL", null));
insDoc(aux3, gLnk(2, "NPL Request","AccMaintenance/AgreementStopAccrued.htm"));
insDoc(aux3, gLnk(2, "NPL Approval","AccMaintenance/StopAccruedApproval.htm"));
insDoc(aux3, gLnk(2, "NPL Reversal","AccMaintenance/AgreementStopAccruedReversal.htm"));
insDoc(aux3, gLnk(2, "NPL Inquiry","AccMaintenance/StopAccruedInquiry.htm"));
aux3 = insFld(aux2, gFld("Write Off", null));
insDoc(aux3, gLnk(2, "Write Off Request","AccMaintenance/AgreementWriteOff.htm"));
insDoc(aux3, gLnk(2, "Write Off Approval","AccMaintenance/WriteOffApproval.htm"));
insDoc(aux3, gLnk(2, "Write Off Inquiry","AccMaintenance/WriteOffInquiry.htm"));
insDoc(aux3, gLnk(2, "Write Off Tax Reported","AccMaintenance/WriteOffReportedTax/WriteOffInquiryList.aspx"));

aux2 = insFld(aux1, gFld("Setting", null));
insDoc(aux2, gLnk(2, "Bank Master","AccMaintenance/BankMaster.htm"));
insDoc(aux2, gLnk(2, "Bank Account","AccMaintenance/BankAccount.htm"));
insDoc(aux2, gLnk(2, "Payment Allocation","AccMaintenance/PaymentAllocation.htm"));
insDoc(aux2, gLnk(2, "Journal Scheme","AccMaintenance/JournalScheme.htm"));
insDoc(aux2, gLnk(2, "Cashier","AccMaintenance/Cashier.htm"));
insDoc(aux2, gLnk(2, "Receipt Form","AccMaintenance/FormControl/ReceiptForm.aspx"));
//insDoc(aux2, gLnk(2, "Payment Point","AccMaintenance/PaymentPointMaintanance.htm"));
//insDoc(aux2, gLnk(2, "Payment Point Bank","AccMaintenance/PaymentPointBank.htm"));


aux1 = insFld(foldersTree, gFld('Setting', null));
aux2 = insFld(aux1, gFld("Organization", null));
insDoc(aux2, gLnk(2, "Company","Setting/Company.htm"));
//insDoc(aux2, gLnk(2, "Area","Setting/Area.htm"));
insDoc(aux2, gLnk(2, "Branch","Setting/Branch.htm"));
aux2 = insFld(aux1, gFld("Report", null));
insDoc(aux2, gLnk(2, "Aging Bucket","Setting/AgingBucket.htm"));
insDoc(aux2, gLnk(2, "Installment Amount","Setting/ReportInstallmentAmount.htm"));
insDoc(aux2, gLnk(2, "Finance Amount","Setting/ReportFinanceAmount.htm"));
insDoc(aux2, gLnk(2, "Percent Effective","Setting/ReportPercentEff.htm"));
insDoc(aux2, gLnk(2, "Percent DP","Setting/ReportPercentDP.htm"));
insDoc(aux1, gLnk(2, "ZipCode","Setting/ZipCode.aspx"));
aux2 = insFld(aux1, gFld("General", null));
insDoc(aux2, gLnk(2, "Term & Condition","Setting/TermCondition.htm"));
insDoc(aux2, gLnk(2, "Economy Sector","Setting/EconomicSector.htm"));
insDoc(aux2, gLnk(2, "Industry Type","Setting/IndustryType.htm"));
insDoc(aux2, gLnk(2, "Master","Setting/Master.htm"));
insDoc(aux2, gLnk(2, "Reason Type","Setting/ReasonType.htm"));
insDoc(aux2, gLnk(2, "Employee Position","Setting/EmployeePosition.htm"));
insDoc(aux2, gLnk(2, "Coverage Area","Setting/General/CoverArea/CoverAreaList.aspx"));
insDoc(aux2, gLnk(2, "Credit Review","Setting/CreditReview/CreditReviewSettingGroupList.aspx"));

// Setting - General
insDoc(aux2, gLnk(2, "Telesales Activity Type","Setting/TseActType/TseActType.aspx"));

//aux2 = insFld(aux1, gFld("Smart Search", null));
//insDoc(aux2, gLnk(2, "Customer","Inquiries/SmartSearchCustomer.htm"));
//insDoc(aux2, gLnk(2, "Agreement","Inquiries/SmartSearchAgreement.htm"));
//insDoc(aux2, gLnk(2, "Asset","Inquiries/SmartSearchAsset.htm"));
//insDoc(aux2, gLnk(2, "Insurance","Inquiries/SmartSearchInsurance.htm"));
//insDoc(aux2, gLnk(2, "Negative List","Inquiries/SmartSearchNegative.htm"));
//insDoc(aux1, gLnk(2, "View Journal","AccMaintenance/JournalView.htm"));


// Asset Document Management
aux1 = insFld(foldersTree, gFld("Asset Document Management", null));
insDoc(aux1 , gLnk(2, "Document Receive","AssetDocMgmt/AssetDocumentReceive.aspx"));
insDoc(aux1 , gLnk(2, "Document Borrow","AssetDocMgmt/AssetDocumentBorrow.aspx"));
insDoc(aux1 , gLnk(2, "Change Location","AssetDocMgmt/AssetDocumentChangeLocation.aspx"));
insDoc(aux1 , gLnk(2, "Document Release","AssetDocMgmt/AssetDocumentRelease.aspx"));
insDoc(aux1 , gLnk(2, "Document Pledging","AssetDocMgmt/DocPledging.aspx"));
insDoc(aux1 , gLnk(2, "Document Pledging Borrow","AssetDocMgmt/AssetDocumentBorrowfrombank.aspx"));
insDoc(aux1 , gLnk(2, "Document Pledging Return","AssetDocMgmt/AssetDocumentReturntoBank.aspx"));


aux2 = insFld(aux1, gFld("Asset Document Collateral Management", null));
insDoc(aux2 , gLnk(2, "Asset Document Collateral","AssetDocMgmt/AssetDocumentCollateral.aspx"));
insDoc(aux2 , gLnk(2, "Asset Document Collateral Receive","AssetDocMgmt/AssetDocumentCollateralReceive.aspx"));
insDoc(aux2 , gLnk(2, "Asset Document Collateral Release","AssetDocMgmt/AssetDocumentCollateralRelease.aspx"));


aux2 = insFld(aux1, gFld('Asset Document Inquiry', null));
insDoc(aux2 , gLnk(2, "Document Status Inquiry","AssetDocMgmt/AssetDocumentInquiry.htm"));
insDoc(aux2 , gLnk(2, "Document BorrowInquiry","AssetDocMgmt/AgingDocumentBorrow.htm"));
insDoc(aux2 , gLnk(2, "Document Wait Inquiry","AssetDocMgmt/AgingDocumentWaiting.htm"));
insDoc(aux2 , gLnk(2, "Agreement Will Mature Inquiry","AssetDocMgmt/AgreementMature.htm"));
insDoc(aux2 , gLnk(2, "Agreement Repossess Inquiry","AssetDocMgmt/AgreementReposses.htm"));
insDoc(aux2 , gLnk(2, "Agreement RRD Inquiry","AssetDocMgmt/AgreementRRD.htm"));

aux2 = insFld(aux1, gFld('BPKB Blokir', null));
insDoc(aux2 , gLnk(2, "BPKB Blokir Request","AssetDocMgmt/BPKBBlock/BPKBBlockRequest_Agreementlist.aspx"));
insDoc(aux2 , gLnk(2, "BPKB Blokir Execution","AssetDocMgmt/BPKBBlock/BPKBBlockExecution.aspx"));
insDoc(aux2 , gLnk(2, "BPKB Blokir Release Release","AssetDocMgmt/BPKBBlock/BPKBBlockRequestRelease_AgreementList.aspx"));


aux2 = insFld(aux1, gFld("Setting", null));
insDoc(aux2, gLnk(2, "Rack and Filling Maintenance","AssetDocMgmt/RackAssetDocument.htm"));
insDoc(aux2, gLnk(2, "General Setting","AssetDocMgmt/GSAssetDocument.htm"));

aux2 = insFld(aux1, gFld("Additional Process", null));
insDoc(aux2, gLnk(2, "Edit Asset Document","AssetDocMgmt/AdditionalProcess/EditDocument.aspx"));

// Collection

aux1 = insFld(foldersTree, gFld('Collection', null));

aux2 = insFld(aux1, gFld("DeskColl", null));
insDoc(aux2, gLnk(2, "Desk Collector Remind Activity","Collection/DeskColl/DeskCollReminderCallAct.htm"));
insDoc(aux2, gLnk(2, "Desk Collector Overdue Activity","Collection/DeskColl/DeskCollOverdueCall.htm"));

aux2 = insFld(aux1, gFld("Collection Lancar", null));
insDoc(aux2, gLnk(2, "Collection Lancar Activity","Collection/CollLancar/CollectionLancarAct.htm"));
insDoc(aux2, gLnk(2, "SP Printing","Collection/CollLancar/SPPrinting.aspx"));

aux2 = insFld(aux1, gFld("Collection Macet", null));
aux3 = insFld(aux2, gFld("Repossess Authorization Letter ( RAL )", null));
insDoc(aux3, gLnk(2, "RAL Printing","Collection/CollMacet/SKTPrinting.htm"));
insDoc(aux3, gLnk(2, "RAL on Request","Collection/CollMacet/SKTOnRequest.htm"));
//insDoc(aux3, gLnk(2, "RAL Extend","Collection/CollMacet/SKTExtend.htm"));
//insDoc(aux3, gLnk(2, "RAL Release","Collection/CollMacet/SKTRelease.htm"));
insDoc(aux3, gLnk(2, "Change Executor","Collection/CollMacet/RALChangeExecutor.htm"));

insDoc(aux2, gLnk(2, "Asset Repossession","Collection/Repossess/RepossessSearch.htm"));
aux3 = insFld(aux2, gFld("Continue Credit", null));
insDoc(aux3, gLnk(2, "Request","Collection/CollMacet/ContinueCredit/ContinueCreditRequest.aspx"));
insDoc(aux3, gLnk(2, "Approval","Collection/CollMacet/ContinueCredit/ContinueCreditApproval.aspx"));

insDoc(aux2, gLnk(2, "Prepayment Letter","Collection/CollMacet/PrepaymentPrinting.htm"));
insDoc(aux2, gLnk(2, "Asset Repossession Appraisal Request","Collection/Repossess/AppraisalSearch.htm"));
insDoc(aux2, gLnk(2, "Asset Selling","Collection/Repossess/SellingSearch.htm"));
insDoc(aux2, gLnk(2, "Change Asset Location","Collection/CollMacet/ChangeAssetLocation.aspx"));
insDoc(aux2, gLnk(2, "Asset Release","Collection/CollMacet/AssetRelease.aspx"));


aux2 = insFld(aux1, gFld("Setting", null));
insDoc(aux2, gLnk(2, "Action & result","Collection/Setting/Actionsetting.htm"));
insDoc(aux2, gLnk(2, "Bucket","Collection/Setting/Bucket.aspx"));
insDoc(aux2, gLnk(2, "Collection Island","Collection/Setting/CollectionIslandSetting.aspx"));
insDoc(aux2, gLnk(2, "Collection Group","Collection/Setting/CollectionGroupSetting.aspx"));
insDoc(aux2, gLnk(2, "Collection","Collection/Setting/CollectorSetting.aspx"));
insDoc(aux2, gLnk(2, "Proffesional Executor","Collection/Setting/ProfessionalCollectorSetting.htm"));
insDoc(aux2, gLnk(2, "Cases","Collection/Setting/Cases.aspx"));
insDoc(aux2, gLnk(2, "Asset Check List","Collection/Setting/AssetChecklist.htm"));
insDoc(aux2, gLnk(2, "General Setting","Collection/Setting/GeneralSetting.aspx"));


aux1 = insFld(foldersTree, gFld('Inquiries', null));
insDoc(aux1, gLnk(2, "Smart Search","Inquiries/SmartSearch.aspx"));

aux1 = insFld(foldersTree, gFld("Approval System", null));
insDoc(aux1, gLnk(2, "Approval Type","Approval/AM_Approval_001.htm"));
insDoc(aux1, gLnk(2, "Approval Scheme","Approval/AM_Approval_002.htm"));

aux1 = insFld(foldersTree, gFld('Utilities', null));
aux2 = insFld(aux1, gFld('Dynamic Workflow Form', null));
insDoc(aux2, gLnk(2, "Dynamic Form","Maintenance/Dynamic_Form/Dynamic_Form_Header.aspx"));
insDoc(aux2, gLnk(2, "Approval Scheme","Approval/AM_Approval_002.htm"));

aux2 = insFld(aux1, gFld('Dynamic Report Form', null));
insDoc(aux2, gLnk(2, "Dynamic Form","Approval/AM_Approval_001.htm"));
insDoc(aux2, gLnk(2, "Approval Scheme","Approval/AM_Approval_002.htm"));



 function fFlyTo(param1) {
var LStrTmp = param1.toUpperCase();
with (document.frmMenu) {
target = 'main';
if((LStrTmp.search(/.jsp/)>=0)&&(LStrTmp.search('HTTP')<0)) {
action = param1;
submit();
} else {
 top.main.navigate(param1);} }
 return; }
function fExpand() {
clickOnNode(1); }
initializeDocument();
/*fExpand();*/</script>

<STYLE>
body {
scrollbar-3dlight-color:#B3C76D;
scrollbar-arrow-color:#999999;
scrollbar-track-color:#ededed;
scrollbar-darkshadow-color:#B3C76D;
scrollbar-face-color:#DCE2C9;
scrollbar-highlight-color:#DCE2C9;
scrollbar-shadow-color:#DCE2C9;
}   </STYLE>
   </HEAD>
   <BODY bgcolor=#F5F5F5>
   <form name=frmMenu method=post>
	  <input type="hidden" name="hidCaller" value="menu">
   </form>
   <!--script language="javascript">
   	window.parent.fload();
   </script-->
   </BODY>
</HTML>