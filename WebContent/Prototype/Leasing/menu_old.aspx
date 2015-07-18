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
aux1 = insFld(foldersTree , gFld('Customer Service', null));
insDoc(aux1, gLnk(2, "Customer Service","CustomerService/CustomerComplain.aspx"));


//Survey Report

aux0 = insFld(foldersTree, gFld('Survey Report', null));
insDoc(aux0 , gLnk(2, "Customer","SurveyReport/Customer.aspx"));

// DE Motor
aux1 = insFld(aux0, gFld('DE Motor', null));
insDoc(aux1, gLnk(2, "Survey Report DE Motor","surveyreport/DEMotor/SurveyReportDEMotor.aspx"));
insDoc(aux1, gLnk(2, "Financial Structure","surveyreport/DEMotor/FinancialDataDEMotor.aspx"));
insDoc(aux1, gLnk(2, "Comission DE Motor","surveyreport/DEMotor/ComissionDEMotor.aspx"));

aux2 = insFld(aux1, gFld("Inquiry", null));
insDoc(aux2, gLnk(2, "New Application","Marketing/ProspectsCustomer.aspx"));


// DE Mobil
aux1 = insFld(aux0, gFld('DE Mobil', null));
insDoc(aux1, gLnk(2, "Supplier","Marketing/Supplier/Supplier.aspx"));

// CF
aux1 = insFld(aux0, gFld('CF', null));

aux2 = insFld(aux1, gFld("New Survey Report", null));
insDoc(aux2, gLnk(2, "New Survey Report","SurveyReport/CF/SurveyReport.aspx"));
//insDoc(aux2, gLnk(2, "Phone Verification","Marketing/ProspectsCustomer.aspx"));


// Leasing
aux1 = insFld(aux0, gFld('Leasing', null));
insDoc(aux1, gLnk(2, "Supplier","Marketing/Supplier/Supplier.aspx"));
aux2 = insFld(aux1, gFld('Marketing Memo', null));
insDoc(aux2, gLnk(2, "Application Data","SurveyReport/Leasing/MarketingMemoLS.aspx"));
insDoc(aux2, gLnk(3, "Asset Data","SurveyReport/Leasing/MarketingMemoLS2.aspx"));
insDoc(aux2, gLnk(4, "Insurance Data","SurveyReport/Leasing/MarketingMemoLS3.aspx"));
insDoc(aux2, gLnk(5, "Financial Data","SurveyReport/Leasing/MarketingMemoLS4.aspx"));
insDoc(aux2, gLnk(6, "Commission Data","SurveyReport/Leasing/MarketingMemoLS5.aspx"));
insDoc(aux2, gLnk(7, "Other Data","SurveyReport/Leasing/MarketingMemoLS6.aspx"));
//insDoc(aux2, gLnk(2, "Phone Verification","Marketing/ProspectsCustomer.aspx"));



// marketing
aux1 = insFld(foldersTree, gFld('Marketing', null));
insDoc(aux1, gLnk(2, "Supplier","Marketing/Supplier/Supplier.aspx"));
aux2 = insFld(aux1, gFld("Prospects", null));
insDoc(aux2, gLnk(2, "New Application","Marketing/ProspectsCustomer.aspx"));
//insDoc(aux2, gLnk(2, "Phone Verification","Marketing/ProspectsCustomer.aspx"));
aux2 = insFld(aux1, gFld("Setting", null));

aux3 = insFld(aux2, gFld("Asset Maintenance", null));
insDoc(aux3, gLnk(2, "Asset Type","Marketing/AssetMnt/AssetType.aspx"));
insDoc(aux3, gLnk(2, "Asset Master","Marketing/AssetMnt/AssetMaster.aspx"));
insDoc(aux3, gLnk(2, "Insurance Asset Category","Marketing/AssetMnt/InsuranceAssetCategory.aspx"));
insDoc(aux3, gLnk(2, "Asset Price List","Marketing/AssetMnt/AssetPriceList.aspx"));

aux3 = insFld(aux2, gFld("Product Maintenance", null));
insDoc(aux3, gLnk(2, "Product","Marketing/Product/Product.aspx"));
insDoc(aux3, gLnk(2, "Product Branch","Marketing/Product/ProductBranchByBranch.aspx"));
aux3 = insFld(aux2, gFld("Credit Scoring", null));
insDoc(aux3 , gLnk(2, "Component Scoring Card","Marketing/CreditScoringComponentListing.htm"));
insDoc(aux3 , gLnk(2, "Scoring Card","Marketing/CreditScoreCardScheme.htm"));
aux4 = insFld(aux2, gFld('Credit Investigation', null));
insDoc(aux4, gLnk(2, "Group Component","Marketing/CreditInvestigation/CreditInvestigationGroupMaintenance.htm"));
insDoc(aux4, gLnk(2, "Question List","Marketing/CreditInvestigation/CreditInvestigationQuestionMaintance.htm"));
insDoc(aux4, gLnk(2, "Scheme","Marketing/CreditInvestigation/CreditInvestigationSchemeMaintance.htm"));
aux5 = insFld(aux2, gFld('Phone Verification', null));
insDoc(aux5, gLnk(2, "Group Component","Marketing/PhoneVerification/PhoneVerificationGroupMaintenance.htm"));
insDoc(aux5, gLnk(2, "Question List","Marketing/PhoneVerification/PhoneVerificationQuestionMaintance.htm"));
insDoc(aux5, gLnk(2, "Scheme","Marketing/PhoneVerification/PhoneVerificationSchemeMaintance.htm"));
insDoc(aux2 , gLnk(2, "General Setting","Marketing/GeneralSetting.htm"));

aux2 = insFld(aux1, gFld("Others", null));
insDoc(aux2, gLnk(2, "Download Sales Data","Marketing/Supplier/DownloadSalesData.aspx"));

aux2 = insFld(aux1, gFld("Report", null));
insDoc(aux2, gLnk(2, "Supplier Incentive","Marketing/Supplier/RptSupplierIncentiveInputParameter.aspx"));

// credit
aux1 = insFld(foldersTree, gFld('Account Acquisition', null));
aux2 = insFld(aux1, gFld("Customer", null));
insDoc(aux2, gLnk(2, "Customer","Credit/Customer.htm"));
insDoc(aux2, gLnk(2, "Negative Customer","Marketing/NegativeList.htm"));
//insDoc(aux2, gLnk(2, "Pre-Screening","Credit/FMF_Pre-ScreeningPersonalCustomer.aspx"));
aux2 = insFld(aux1, gFld("Credit Proses", null));
aux3 = insFld(aux2, gFld("New Application", null));
aux4 = insFld(aux3, gFld("General", null));
insDoc(aux4, gLnk(2, "Application", "Credit/CustomerList.htm"));
insDoc(aux4, gLnk(2, "Asset Data", "Credit/AgreementListAsset.htm"));
insDoc(aux4, gLnk(2, "Insurance Data", "Credit/AgreementListInsurance.htm"));
insDoc(aux4, gLnk(2, "Financial Data", "Credit/AgreementListAmortization.htm"));
insDoc(aux4, gLnk(2, "Commision Data", "Credit/Commision.htm"));
aux5 = insFld(aux3, gFld("Electronics", null));
insDoc(aux5, gLnk(2, "Application", "Credit/CustomerList_Electronics.htm"));
insDoc(aux5, gLnk(2, "Asset Data", "Credit/AgreementListAsset_Electronics.htm"));
insDoc(aux5, gLnk(2, "Insurance Data", "Credit/AgreementListInsurance_Electronics.htm"));
insDoc(aux5, gLnk(2, "Financial Data", "Credit/AgreementListAmortization_Electronics.htm"));
aux5 = insFld(aux3, gFld("Card Plus", null));
insDoc(aux5, gLnk(2, "Application", "Credit/CustomerList_KTA.htm"));
insDoc(aux5, gLnk(2, "Financial Data", "Credit/AgreementListAmortization_KTA.htm"));
//insDoc(aux2, gLnk(2, "Application Maintenance", "Credit/AgreementList.htm"));
insDoc(aux2, gLnk(2, "Phone Verification","Credit/AgreementListPhoneVerification.htm"));
insDoc(aux2, gLnk(2, "Credit Investigation","Credit/AgreementListCreditInvestigation.htm"));
insDoc(aux2, gLnk(2, "Credit Scoring","Credit/CreditScoring.htm"));
insDoc(aux2, gLnk(2, "Request For Credit Approval","Credit/RequestForCredit.htm"));
insDoc(aux2, gLnk(2, "Approval","Credit/Approval.htm"));
insDoc(aux2, gLnk(2, "Pledge To Funding Company","Credit/AgreementSelectionToFunding.htm"));
insDoc(aux2, gLnk(2, "Purchase Order","Credit/PurchaseOrder.htm"));
insDoc(aux2, gLnk(2, "Delivery order","Credit/DeliveryOrder.htm"));
insDoc(aux2, gLnk(2, "Invoice","Credit/Invoice.htm"));
insDoc(aux2, gLnk(2, "Go Live","Credit/GoLive.htm"));
aux3 = insFld(aux2, gFld("Additional Proses", null));
//aux4 = insFld(aux3, gFld("Application Maintanance", null));
insDoc(aux3, gLnk(2, "Copy Application","Credit/CustomerList_CopyApplication.htm"));
insDoc(aux3, gLnk(2, "Application Maintanace","Credit/ApplicationMaintenance.htm"));
//insDoc(aux4, gLnk(2, "Electronics","Credit/ApplicationMaintenance_Electronics.htm"));
//insDoc(aux4, gLnk(2, "KTA","Credit/ApplicationMaintenance_KTA.htm"));
insDoc(aux3, gLnk(2, "Edit Outstanding TC","Credit/OutstandingTC.htm"));
insDoc(aux3, gLnk(2, "Cancel Application","Credit/RejectCancelAgreement.htm"));
insDoc(aux3, gLnk(2, "PO Extension","Credit/POExtension.htm"));
//insDoc(aux3, gLnk(2, "Incentive Supplier","Credit/IncentiveExternalListing.htm"));
insDoc(aux3, gLnk(2, "Incentive Supplier","Credit/CommisionSupplier.htm"));
aux2 = insFld(aux1, gFld("Inquiry", null));
insDoc(aux2, gLnk(2, "Application In per Period","Marketing/ApplicationInPerPeriod.htm"));
insDoc(aux2, gLnk(2, "Application Rejected","Marketing/ApplicationRejected.htm"));
insDoc(aux2, gLnk(2, "Sales per Period","Credit/SalesPerPeriod.htm"));
insDoc(aux2, gLnk(2, "Aging Status","Credit/AgingStatus.htm"));
insDoc(aux2, gLnk(2, "Expired ID Type","Credit/ExpiredIDType.htm"));
insDoc(aux2, gLnk(2, "Expired TC Check List","Credit/ExpiredTCCheckList.htm"));
aux3 = insFld(aux2, gFld("Credit Proses Status (Backlog)", null));
insDoc(aux3, gLnk(2, "Pending Data Entry","Credit/PendingDataEntry.htm"));
insDoc(aux3, gLnk(2, "Pending RCA","Credit/PendingRCA.htm"));
insDoc(aux3, gLnk(2, "Pending Approval","Credit/PendingApproval.htm"));
insDoc(aux3, gLnk(2, "Pending PO","Credit/PendingPO.htm"));
insDoc(aux3, gLnk(2, "Pending DO","Credit/PendingDO.htm"));
insDoc(aux3, gLnk(2, "Pending Invoice","Credit/PendingInvoice.htm"));
insDoc(aux3, gLnk(2, "Pending Go Live","Credit/PendingGoLive.htm"));
insDoc(aux2, gLnk(2, "Activity Log","Credit/ActivityLog.htm"));
insDoc(aux2, gLnk(2, "Sales with Certain Condition","Credit/SalesWithCertainCondition.htm"));
aux2 = insFld(aux1, gFld("Reports", null));
aux7 = insFld(aux2, gFld("FMF", null));
insDoc(aux7, gLnk(2, "Incoming Applications","Credit/Reports/FMF/IncomingApplication.aspx"));
insDoc(aux7, gLnk(2, "Sales Dealer Evalution","Credit/Reports/FMF/EvaluationSalesDealer.aspx"));
insDoc(aux7, gLnk(2, "Applications Process Status","Credit/Reports/FMF/ProcessStatusApplications.aspx"));
insDoc(aux7, gLnk(2, "Applications Status (By Percentage)","Credit/Reports/FMF/ApplicationStatusByPercentage.aspx"));
insDoc(aux7, gLnk(2, "Deviasi Approval","Credit/Reports/FMF/DeviasiReport.aspx"));
insDoc(aux7, gLnk(2, "Surveyor's Visit","Credit/Reports/FMF/SurveyVisit.aspx"));
insDoc(aux7, gLnk(2, "Pending Application","Credit/Reports/FMF/ApplicationPending.aspx"));
insDoc(aux7, gLnk(2, "Laporan Status Kredit","Credit/Reports/FMF/LaporanStatusKredit.aspx"));
insDoc(aux7, gLnk(2, "First Payment Default","Credit/Reports/FMF/FirstPaymentDefault.aspx"));
//insDoc(aux7, gLnk(2, "Laporan Persetujuan Kredit","Credit/Reports/FMF/LaporanPersetujuanKredit.aspx"));
aux3 = insFld(aux2, gFld("Sales", null));
insDoc(aux3, gLnk(2, "Daily Sales by AO","Marketing/Reports/DailySalesByAO.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by AO","Marketing/Reports/MonthlySalesByAO.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by Branch","Marketing/Reports/MonthlySalesByBranch.htm"));
insDoc(aux3, gLnk(2, "Daily Sales by CA","Marketing/Reports/DailySalesByCA.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by CA","Marketing/Reports/MonthlySalesByCA.htm"));
insDoc(aux3, gLnk(2, "Daily Sales by Brand","Marketing/Reports/DailySalesByBrand.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by Brand","Marketing/Reports/MonthlySalesByBrand.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by Brand Nat","Marketing/Reports/MonthlySalesByBrandNat.htm"));
insDoc(aux3, gLnk(2, "Daily Sales by % DP","Marketing/Reports/DailySalesBy%DP.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by % DP","Marketing/Reports/MonthlySalesBy%DP.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by % DP Nat","Marketing/Reports/MonthlySalesBy%DPNat.htm"));
insDoc(aux3, gLnk(2, "Daily Sales by % Eff Rate","Marketing/Reports/DailySalesByEFRate.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by % Eff Rate","Marketing/Reports/MonthlySalesByEFRate.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by % Eff Rate Nat","Marketing/Reports/MonthlySalesByEFRateNat.htm"));
insDoc(aux3, gLnk(2, "Daily Sales by Amount Finance","Marketing/Reports/DailySalesByAmountFinance.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by Amount Finance","Marketing/Reports/MonthlySalesByAmountFinance.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by Amount Finance Nat","Marketing/Reports/MonthlySalesByAmountFinanceNat.htm"));
insDoc(aux3, gLnk(2, "Daily Sales by Installment","Marketing/Reports/DailySalesByInstallment.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by Installment","Marketing/Reports/MonthlySalesByInstallment.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by Installment Nat","Marketing/Reports/MonthlySalesByInstallmentNat.htm"));
insDoc(aux3, gLnk(2, "Daily Sales by Tenor","Marketing/Reports/DailySalesByTenor.htm"));
insDoc(aux3, gLnk(2, "Monthly Sales by Tenor","Marketing/Reports/MonthlySalesByTenor.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by Tenor Nat","Marketing/Reports/MonthlySalesByTenorNat.htm"));
//insDoc(aux3, gLnk(2, "Daily Sales by Insurance Type","Marketing/Reports/DailySalesByInsuranceType.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by Insurance Type","Marketing/Reports/MonthlySalesByInsuranceType.htm"));
//insDoc(aux3, gLnk(2, "Monthly Sales by Insurance Type Nat","Marketing/Reports/MonthlySalesByInsuranceTypeNat.htm"));
aux3 = insFld(aux2, gFld("Credit Scoring Reports", null));
//insDoc(aux3, gLnk(2, "Scoring by AO","Credit/Reports/ScoringAO.htm"));
//insDoc(aux3, gLnk(2, "Scoring by CA","Credit/Reports/ScoringCA.htm"));
insDoc(aux3, gLnk(2, "Scoring for Personal (Employee)","Credit/Reports/ScoringPersonalEmployee.htm"));
//insDoc(aux3, gLnk(2, "Scoring for Personal (Entrepreneur)","Credit/Reports/ScoringPersonalEntrepreneur.htm"));
//insDoc(aux3, gLnk(2, "Scoring for Personal (Professional)","Credit/Reports/ScoringPersonalProfessional.htm"));
//insDoc(aux3, gLnk(2, "Scoring for Company","Credit/Reports/ScoringCompany.htm"));
aux3 = insFld(aux2, gFld("Overdue Reports", null));
insDoc(aux3, gLnk(2, "AO AR Overdue","Credit/Reports/AOAROverdue.htm"));
//insDoc(aux3, gLnk(2, "CA AR Overdue","Credit/Reports/CAAROverdue.htm"));
//insDoc(aux3, gLnk(2, "CA AR Overdue per Area","Credit/Reports/CAAROverdueArea.htm"));
aux3 = insFld(aux2, gFld("Aging Reports", null));
insDoc(aux3, gLnk(2, "Aging By Model","Credit/Reports/AgingByModel.htm"));
insDoc(aux3, gLnk(2, "Aging By AO","UnderConstruction.htm"));
insDoc(aux3, gLnk(2, "Aging By %Eff Rate","UnderConstruction.htm"));
insDoc(aux3, gLnk(2, "Aging By %DP","UnderConstruction.htm"));
insDoc(aux3, gLnk(2, "Aging By Tenor","UnderConstruction.htm"));
insDoc(aux3, gLnk(2, "Aging By Installment","UnderConstruction.htm"));
insDoc(aux3, gLnk(2, "Aging By Amount Finance","UnderConstruction.htm"));
aux3 = insFld(aux2, gFld("Application Pending Reports", null));
insDoc(aux3, gLnk(2, "Up to Last Month Pending","Marketing/Reports/UpToLastMonthPending.htm"));
insDoc(aux3, gLnk(2, "Application Status Monitoring","Marketing/Reports/ApplicationMonitoring.htm"));
aux3 = insFld(aux2, gFld("Account Receivables Reports", null));
insDoc(aux3, gLnk(2, "Outstanding AR Summary","UnderConstruction.htm"));
insDoc(aux3, gLnk(2, "Outstanding AR Detail","UnderConstruction.htm"));
insDoc(aux1, gLnk(2, "Document","Credit/Print.htm"));
aux2 = insFld(aux1, gFld("Setting", null));

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
insDoc(aux2, gLnk(2, "Transfer Fund Reconcile","Finance/TransferFundReconcile.htm"));
insDoc(aux2, gLnk(2, "Transfer Fund Inquiry","Finance/TransferFundInquiry.htm"));
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
aux2 = insFld(aux1, gFld("Joint Finance", null));
aux3 = insFld(aux2, gFld("Without Recourse", null));
insDoc(aux3 , gLnk(2, "Funding Contract","ChannelSecurity/FundingSourceContractJFSearch.htm"));
aux4 = insFld(aux3 , gFld("Before Go Live", null));
insDoc(aux4 , gLnk(2, "Execution","ChannelSecurity/ExecutionContracttJFBefore.htm"));
aux5 = insFld(aux3 , gFld("After Go Live", null));
insDoc(aux5 , gLnk(2, "Funding Agreement","ChannelSecurity/FundingAgreementJF.htm"));
insDoc(aux5 , gLnk(2, "Execution","ChannelSecurity/ExecutionContracttJF.htm"));
insDoc(aux3 , gLnk(2, "Draw Down","ChannelSecurity/DrawdownBatchJF.htm"));
aux6 = insFld(aux3 , gFld("Payment Out", null));
aux7 = insFld(aux6 , gFld("Mirroring", null));
insDoc(aux7 , gLnk(2, "Request","ChannelSecurity/PaymentOutBatchJFMirror.htm"));
insDoc(aux7 , gLnk(2, "Execution","ChannelSecurity/ExecutePaymentOutBatchJFMirror.htm"));
aux8 = insFld(aux6 , gFld("Non Mirroring", null));
insDoc(aux8 , gLnk(2, "Request","ChannelSecurity/PaymentOutBatchJF.htm"));
insDoc(aux8 , gLnk(2, "Execution","ChannelSecurity/ExecutePaymentOutBatchJF.htm"));
insDoc(aux3 , gLnk(2, "Fees","ChannelSecurity/PaymentOutFeesContractJF.htm"));
aux9 = insFld(aux3 , gFld("Buy Back", null));
aux10 = insFld(aux9 , gFld("Mirroring", null));
insDoc(aux10 , gLnk(2, "Request","ChannelSecurity/BuyBackContract.htm"));
insDoc(aux10 , gLnk(2, "Execution","ChannelSecurity/BuyBackContractExecution.htm"));
aux11 = insFld(aux9 , gFld("Non Mirroring", null));
insDoc(aux11 , gLnk(2, "Request","ChannelSecurity/BuyBackContractNonMirroring.htm"));
insDoc(aux11 , gLnk(2, "Execution","ChannelSecurity/BuyBackContractExecutionNonMirroring.htm"));
aux12 = insFld(aux1, gFld("Channeling", null));
aux13 = insFld(aux12 , gFld("Without Recourse", null));
insDoc(aux13 , gLnk(2, "Funding Contract","ChannelSecurity/FundingSourceContractCHSearch.htm"));
aux14 = insFld(aux13 , gFld("Before Go Live", null));
insDoc(aux14 , gLnk(2, "Execution","ChannelSecurity/ExecutionContracttCHBefore.htm"));
aux15 = insFld(aux13 , gFld("After Go Live", null));
insDoc(aux15 , gLnk(2, "Funding Agreement","ChannelSecurity/FundingAgreementCH.htm"));
insDoc(aux15 , gLnk(2, "Execution","ChannelSecurity/ExecutionContracttCH.htm"));
insDoc(aux13 , gLnk(2, "Draw Down","ChannelSecurity/DrawdownBatchCH.htm"));
aux16 = insFld(aux13 , gFld("Payment Out", null));
aux17 = insFld(aux16 , gFld("Mirroring", null));
insDoc(aux17 , gLnk(2, "Request","ChannelSecurity/PaymentOutBatchCHMirror.htm"));
insDoc(aux17 , gLnk(2, "Execution","ChannelSecurity/ExecutePaymentOutBatchCHMirror.htm"));
aux18 = insFld(aux16 , gFld("Non Mirroring", null));
insDoc(aux18 , gLnk(2, "Request","ChannelSecurity/PaymentOutBatchCH.htm"));
insDoc(aux18 , gLnk(2, "Execution","ChannelSecurity/ExecutePaymentOutBatchCH.htm"));
insDoc(aux13 , gLnk(2, "Fees","ChannelSecurity/PaymentOutFeesContractCH.htm"));
aux19 = insFld(aux13 , gFld("Buy Back", null));
aux20 = insFld(aux19 , gFld("Mirroring", null));
insDoc(aux20 , gLnk(2, "Request","ChannelSecurity/BuyBackContractCH.htm"));
insDoc(aux20 , gLnk(2, "Execution","ChannelSecurity/BuyBackContractExecutionCH.htm"));
aux21 = insFld(aux19 , gFld("Non Mirroring", null));
insDoc(aux21 , gLnk(2, "Request","ChannelSecurity/BuyBackContractNonMirroringCH.htm"));
insDoc(aux21 , gLnk(2, "Execution","ChannelSecurity/BuyBackContractExecutionNonMirroringCH.htm"));

aux1 = insFld(foldersTree, gFld('Account Maintenance', null));
aux2 = insFld(aux1, gFld("Cashier", null));
insDoc(aux2, gLnk(2, "Open/Close Cashier", "AccMaintenance/OpenCloseCashier.htm"));
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
insDoc(aux3, gLnk(3, "Payment Receive", "AccMaintenance/AgreementReceive.htm"));
insDoc(aux3, gLnk(3, "Payment Reversal","AccMaintenance/AgreementPaymentReversal.htm"));
aux3 = insFld(aux2, gFld("Payment Point", null));
//insDoc(aux3, gLnk(3, "Payment Point Transaction", "AccMaintenance/AgreementPaymentPointNext.htm"));
insDoc(aux3, gLnk(3, "Payment Point Transaction", "AccMaintenance/AgreementPaymentPointPostingPayment.htm"));
aux4 = insFld(aux3, gFld("Report", null));
insDoc(aux4, gLnk(3, "Payment Point", "AccMaintenance/Reports/FMF/PaymentPointTransaction.aspx"));
aux3 = insFld(aux2, gFld("Suspend Account", null));
insDoc(aux3, gLnk(2, "Suspend Receive","AccMaintenance/SuspendReceive.htm"));
insDoc(aux3, gLnk(2, "Suspend Reversal","AccMaintenance/SuspendReversal.htm"));
insDoc(aux3, gLnk(2, "Suspend Allocation","AccMaintenance/SuspendAllocation.htm"));
insDoc(aux3, gLnk(2, "Suspend Inquiry","AccMaintenance/SuspendInquiry.htm"));
aux3 = insFld(aux2, gFld("Petty Cash", null));
aux4 = insFld(aux3, gFld("Petty Cash Transaction", null));
insDoc(aux4, gLnk(2, "Petty Cash Transaction","AccMaintenance/PettyCashTransaction.htm"));
insDoc(aux4, gLnk(2, "Petty Cash Reversal","AccMaintenance/PettyCashReversal.htm"));
insDoc(aux4, gLnk(2, "Petty Cash Inquiry","AccMaintenance/PettyCashInquiry.htm"));
aux4 = insFld(aux3, gFld("Petty Cash Reimburse", null));
insDoc(aux4, gLnk(2, "PC Reimburse Request","AccMaintenance/PettyCashReimburse.htm"));
insDoc(aux4, gLnk(2, "PC Reimburse Reconcile","AccMaintenance/PettyCashReimburseReconcile.htm"));
insDoc(aux4, gLnk(2, "PC Reimburse Inquiry","AccMaintenance/PettyCashReimburseInquiry.htm"));
aux3 = insFld(aux2, gFld("Advance Transaction", null));
insDoc(aux3, gLnk(2, "Advance Request","AccMaintenance/PettyCashAdvanceRequest.htm"));
insDoc(aux3, gLnk(2, "Advance Return","AccMaintenance/PettyCashAdvanceReturn.htm"));
insDoc(aux3, gLnk(2, "Advance Inquiry","AccMaintenance/PettyCashAdvanceInquiry.htm"));
aux3 = insFld(aux2, gFld("Other Transactions", null));
insDoc(aux3, gLnk(2, "Inventory Selling Receive", "AccMaintenance/InventorySellingReceive.htm"));
insDoc(aux3, gLnk(2, "Receive from Insurance Co.", "AccMaintenance/InsuranceClaimReceive.htm"));
insDoc(aux2, gLnk(2, "Cash Bank Transaction Inquiry", "AccMaintenance/CashBankTransactionInquiry.htm"));
aux2 = insFld(aux1, gFld("Waive Transaction", null));
insDoc(aux2, gLnk(2, "Request","AccMaintenance/AgreementWaiveTransaction.htm"));
insDoc(aux2, gLnk(2, "Approval","AccMaintenance/AgreementWaiveTransactionApproval.htm"));
insDoc(aux2, gLnk(2, "Inquiry","AccMaintenance/AgreementWaiveTransactionInquiry.htm"));
aux2 = insFld(aux1, gFld("Amendment", null));
aux3 = insFld(aux2, gFld("Prepayment", null));
insDoc(aux3, gLnk(2, "Calculation","AccMaintenance/Prepayment/PrepaymentCalculation.htm"));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/Prepayment/AgreementPrepayment.aspx"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/Prepayment/PrepaymentApproval.aspx"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/Prepayment/PrepaymentExecution.aspx"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/Prepayment/PrepaymentInquiry.aspx"));
aux3 = insFld(aux2, gFld("Prepayment Without RRD", null));
insDoc(aux3, gLnk(2, "Calculation","AccMaintenance/PrepaymentWithoutRRD/PrepaymentCalculation.htm"));
insDoc(aux3, gLnk(2, "Request","AccMaintenance/PrepaymentWithoutRRD/AgreementPrepaymentWithoutRRD.aspx"));
insDoc(aux3, gLnk(2, "Approval","AccMaintenance/PrepaymentWithoutRRD/PrepaymentApproval.htm"));
insDoc(aux3, gLnk(2, "Execution","AccMaintenance/PrepaymentWithoutRRD/PrepaymentExecution.htm"));
insDoc(aux3, gLnk(2, "Inquiry","AccMaintenance/PrepaymentWithoutRRD/PrepaymentInquiry.htm"));
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
aux2 = insFld(aux1, gFld("Fiducia", null));
insDoc(aux2, gLnk(2, "Fiducia Registration", "AccMaintenance/FiduciaRegistration.htm"));
insDoc(aux2, gLnk(2, "Fiducia Akta Receive", "AccMaintenance/FiduciaReceipt.htm"));
insDoc(aux2, gLnk(2, "Fiducia Inquiry", "AccMaintenance/FiduciaInquiry.htm"));
//insDoc(aux2, gLnk(2, "Notary Maintenance", "AccMaintenance/Notary.htm"));
insDoc(aux2, gLnk(2, "Setting", "AccMaintenance/GSFiducia.htm"));
aux2 = insFld(aux1, gFld("Setting", null));
insDoc(aux2, gLnk(2, "Bank Master","AccMaintenance/BankMaster.htm"));
insDoc(aux2, gLnk(2, "Bank Account","AccMaintenance/BankAccount.htm"));
insDoc(aux2, gLnk(2, "Payment Allocation","AccMaintenance/PaymentAllocation.htm"));
insDoc(aux2, gLnk(2, "Journal Scheme","AccMaintenance/JournalScheme.htm"));
insDoc(aux2, gLnk(2, "Cashier","AccMaintenance/Cashier.htm"));
insDoc(aux2, gLnk(2, "Receipt Form","AccMaintenance/FormControl/FormKwintansiCollector.aspx"));
//insDoc(aux2, gLnk(2, "Payment Point","AccMaintenance/PaymentPointMaintanance.htm"));
//insDoc(aux2, gLnk(2, "Payment Point Bank","AccMaintenance/PaymentPointBank.htm"));

// Asset Document Management
aux1 = insFld(foldersTree, gFld('Asset Document Management', null));
insDoc(aux1, gLnk(2, "Document Receive","AssetManagement/AgreementDocumentReceive.htm"));
insDoc(aux1, gLnk(2, "Document Borrow","AssetManagement/AgreementDocumentBorrow.htm"));
insDoc(aux1, gLnk(2, "Document Release","AssetManagement/AgreementDocumentRelease.htm"));
insDoc(aux1, gLnk(2, "Change Location","AssetManagement/AgreementDocumentChangeLocation.htm"));
insDoc(aux1, gLnk(2, "Koreksi BPKB","AssetManagement/AgreementDocumentKoreksiBPKB.htm"));
insDoc(aux1, gLnk(2, "SP BPKB Extend","AssetDocument/SPBpkbExtendAwal.aspx"));

aux2 = insFld(aux1, gFld("Print", null));
insDoc(aux2, gLnk(2, "SP BPKB To Dealer","AssetDocument/SpToDealer.aspx"));
insDoc(aux2, gLnk(2, "SP BPKB To Customer","AssetDocument/SpToCustomer.aspx"));
insDoc(aux2, gLnk(2, "Asset Document Release","AssetDocument/AssetDocumentRelease.aspx"));

aux2 = insFld(aux1, gFld("Inquiry", null));
insDoc(aux2, gLnk(2, "Asset Document Status","AssetManagement/AssetDocumentInquiry.htm"));
insDoc(aux2, gLnk(2, "Aging Document","AssetManagement/AgingDocumentWaiting.htm"));
insDoc(aux2, gLnk(2, "Aging Document Borrow","AssetManagement/AgingDocumentBorrow.htm"));
insDoc(aux2, gLnk(2, "Agreement Will Mature","AssetManagement/AgreementMature.htm"));
insDoc(aux2, gLnk(2, "Agreement Ready to Release Document","AssetManagement/AgreementRRD.htm"));
insDoc(aux2, gLnk(2, "Agreement Repossession","AssetManagement/AgreementReposses.htm"));
insDoc(aux2, gLnk(2, "Pending Send Document To Funding Company","AssetDocument/Inquiry/FrmInqPendingAssetDocToFundCompPledge.aspx"));
insDoc(aux2, gLnk(2, "Pending Receive Document From Funding Company","AssetDocument/Inquiry/FrmInqPendingReceiveDocFromFundCompPledge.aspx"));
aux2 = insFld(aux1, gFld("Setting", null));
insDoc(aux2, gLnk(2, "Rack and Filling Maintenance","AssetManagement/RackAssetDocument.htm"));
insDoc(aux2, gLnk(2, "General Setting","AssetManagement/GSAssetDocument.htm"));

aux2 = insFld(aux1, gFld("Report", null));
insDoc(aux2, gLnk(2, "BPKB Finish Loan Report","AssetDocument/RptBpkbFinishLoanInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Overdue SP BPKB Report","AssetDocument/RptOverdueSpBpkbInputParameter.aspx"));


aux1 = insFld(foldersTree, gFld('Insurance', null));

//insDoc(aux1, gLnk(2, "Insurance Company Selection","Insurance/InsuranceCompanySelection.htm"));
insDoc(aux1, gLnk(2, "SPPA","Insurance/SPPA.htm"));
insDoc(aux1, gLnk(2, "Change Insco","Insurance/ChangeInsco.aspx"));
insDoc(aux1, gLnk(2, "Policy Receive","Insurance/PolicyReceiving.htm"));
insDoc(aux1, gLnk(2, "Edit Policy Receive","Insurance/EditPolicyReceiving.htm"));
insDoc(aux1, gLnk(2, "Insurance Billing","Insurance/InsuranceBillingSearch.htm"));
insDoc(aux1, gLnk(2, "Print Insurance Billing","Insurance/PrintBilling.aspx"));
//aux2 = insFld(aux1, gFld("Endorsment", null));
insDoc(aux1, gLnk(2, "Endorsment Premi","Insurance/EndorsmentRequest.htm"));
//insDoc(aux2, gLnk(2, "Endorsment Data","Insurance/EndorsmentData.htm"));
insDoc(aux1, gLnk(2, "Edit Inslength","Insurance/EditInslength.htm"));
//insDoc(aux1, gLnk(2, "Endorsment Rescheduling","Insurance/EndorsmentRequestResch.htm"));
insDoc(aux1, gLnk(2, "Renewal Letter Print","Insurance/RenewalPrint.htm"));
insDoc(aux1, gLnk(2, "Edit Coverage For Renewal","Insurance/InsuranceRenewal.htm"));
aux2 = insFld(aux1, gFld("Claim", null));
//aux3 = insFld(aux2, gFld("Advance Claim Cost", null));
//insDoc(aux3, gLnk(2, "Request","Insurance/ClaimExpenseRequest.htm"));
//insDoc(aux3, gLnk(2, "Approval","Insurance/ClaimCostApproval.htm"));
insDoc(aux2, gLnk(2, "Claim Request","Insurance/ClaimRequest.htm"));
insDoc(aux2, gLnk(2, "Claim Activity","Insurance/ClaimActivity.htm"));
insDoc(aux1, gLnk(2, "Termination","Insurance/InsuranceTermination.htm"));
//insDoc(aux1, gLnk(2, "Change Insurance Co.","Insurance/ChangeInsurance.htm"));
insDoc(aux1, gLnk(2, "New Cover For Existing Application","Insurance/NewCoverForExistingApp.htm"));

aux2 = insFld(aux1, gFld("Setting", null));
insDoc(aux2, gLnk(2, "Premium to Customer","Insurance/PremiumToCustomerSetting.htm"));
insDoc(aux2, gLnk(2, "Insurance Company & Branch","Insurance/InsuranceCompanySetting.htm"));
insDoc(aux2, gLnk(2, "Insurance Standard Rate","Insurance/InsuranceStandardPremium_New.aspx"));
insDoc(aux2, gLnk(2, "Insurance Profit Sharing","Insurance/InsuranceCompanyProfitSharingSearch.aspx"));
//insDoc(aux2, gLnk(2, "Insurance Quota","Insurance/InsuranceQuoteSetting.htm"));
insDoc(aux2, gLnk(2, "Insurance Document","Insurance/InsuranceDocumentSetting.htm"));
insDoc(aux2, gLnk(2, "Insurance Claim Document","Insurance/InsuranceClaimDocumentSetting.htm"));
insDoc(aux2, gLnk(2, "General Setting","Insurance/GeneralSetting.htm"));


aux2 = insFld(aux1, gFld("Inquiry and Report", null));
aux3 = insFld(aux2, gFld("Inquiry", null));
insDoc(aux3, gLnk(2, "Insurance Covering","Insurance/InsuranceCoveringSearch.htm"));
insDoc(aux3, gLnk(2, "Existing Covering","Insurance/ExistingCoveringSearch.htm"));
insDoc(aux3, gLnk(2, "Insurance Invoice","Insurance/InsuranceInvoiceSearch.htm"));
insDoc(aux3, gLnk(2, "Insurance Expired","Insurance/ExpiredInquirySearch.htm"));
insDoc(aux3, gLnk(2, "Insurance Amandment","Insurance/AmandmentInquirySearch.htm"));
insDoc(aux3, gLnk(2, "Insurance Claim","Insurance/ClaimInquirySearch.htm"));
insDoc(aux3, gLnk(2, "Insurance Refund","Insurance/RefundInquirySearch.htm"));
insDoc(aux3, gLnk(2, "Insurance Not Refundable","Insurance/InquiryNotRefundableSearch.htm"));

aux3 = insFld(aux2, gFld("Report", null));
insDoc(aux3, gLnk(2, "Insurance Refund","Insurance/InsuranceRefund.aspx"));
insDoc(aux3, gLnk(2, "Insurance Unrefund","Insurance/InsuranceUnrefund.aspx"));
insDoc(aux3, gLnk(2, "SPPA Report","Insurance/SPPAReport.aspx"));
insDoc(aux3, gLnk(2, "Policy More 14 Days","Insurance/PolicyInsuranceMore14Days.aspx"));
insDoc(aux3, gLnk(2, "Insurance Cover","Insurance/InsuranceCover.htm"));
insDoc(aux3, gLnk(2, "Insurance Coverage & Premium","Insurance/InsuranceCoveragePremium.htm"));
insDoc(aux3, gLnk(2, "Insurance Policy","Insurance/InsurancePolicy.htm"));
insDoc(aux3, gLnk(2, "Insurance Profit Sharing","Insurance/InsuranceProfitSharing.aspx"));
//insDoc(aux3, gLnk(2, "Insurance Refund","Insurance/InsuranceRefund.htm"));
insDoc(aux3, gLnk(2, "Insurance Claim","Insurance/InsuranceClaim.htm"));
insDoc(aux3, gLnk(2, "Insurance Claim Outstanding","Insurance/InsuranceClaimOutstanding.htm"));
insDoc(aux3, gLnk(2, "Insurance Claim Realization","Insurance/InsuranceClaimRealization.htm"));
insDoc(aux3, gLnk(2, "Endorsment","Insurance/EndorsmentReport.htm"));
insDoc(aux3, gLnk(2, "Insurance Revenue","Insurance/InsuranceRevenue.htm"));
//insDoc(aux3, gLnk(2, "Insurance Statistic","Insurance/InsuranceStatistic.htm"));
insDoc(aux3, gLnk(2, "Insurance Payable","Insurance/InsurancePayable.htm"));
//insDoc(aux3, gLnk(2, "Insurance Receivable","Insurance/InsuranceReceivable.htm"));




// CONFINS FACILITY
//aux1 = insFld(foldersTree, gFld('Features', null));
//aux2 = insFld(aux1, gFld("Upload And Download Data", null));
//insDoc(aux2, gLnk(2, "Upload And Download Data","Features/UploadAndDownloadData/UploadAndDownloadData.aspx"));
//insDoc(aux2, gLnk(2, "Allocation  Data","Features/UploadAndDownloadData/AllocationData.aspx"));


// Collection

aux1 = insFld(foldersTree, gFld('Collection', null));

aux2 = insFld(aux1, gFld("DeskColl", null));
insDoc(aux2, gLnk(2, "Desk Collector Remind Activity","Collection/DeskColl/DeskCollReminderCallAct.htm"));
insDoc(aux2, gLnk(2, "Desk Collector Overdue Activity","Collection/DeskColl/DeskCollOverdueCall.htm"));

aux2 = insFld(aux1, gFld("Collection Lancar", null));
insDoc(aux2, gLnk(2, "Collection Lancar Activity","Collection/CollLancar/CollectionLancarAct.htm"));
insDoc(aux2, gLnk(2, "SP Printing","Collection/CollLancar/SPPrintingAwal.aspx"));

aux2 = insFld(aux1, gFld("Collection Macet", null));
aux3 = insFld(aux2, gFld("Repossess Authorization Letter ( RAL )", null));
insDoc(aux3, gLnk(2, "RAL Printing","Collection/CollMacet/SKTPrinting.htm"));
insDoc(aux3, gLnk(2, "RAL on Request","Collection/CollMacet/SKTOnRequest.htm"));
//insDoc(aux3, gLnk(2, "RAL Extend","Collection/CollMacet/SKTExtend.htm"));
//insDoc(aux3, gLnk(2, "RAL Release","Collection/CollMacet/SKTRelease.htm"));
insDoc(aux3, gLnk(2, "Change Executor","Collection/CollMacet/RALChangeExecutor.htm"));

insDoc(aux2, gLnk(2, "Asset Repossession","Collection/Repossess/RepossessSearch.htm"));
insDoc(aux2, gLnk(2, "Prepayment Letter","Collection/CollMacet/PrepaymentPrinting.htm"));
insDoc(aux2, gLnk(2, "Asset Repossession Appraisal Request","Collection/Repossess/AppraisalSearch.htm"));
insDoc(aux2, gLnk(2, "Asset Selling","Collection/Repossess/SellingSearch.htm"));
insDoc(aux2, gLnk(2, "Change Asset Location","Collection/CollMacet/ChangeAssetLocation.aspx"));
insDoc(aux2, gLnk(2, "Asset Release","Collection/CollMacet/AssetRelease.aspx"));


aux2 = insFld(aux1, gFld("Setting", null));
insDoc(aux2, gLnk(2, "Collection","Collection/Setting/CollectorSettingSearch.aspx"));
insDoc(aux2, gLnk(2, "Cases","Collection/Setting/Cases.aspx"));
insDoc(aux2, gLnk(2, "Bucket","Collection/Setting/Bucket.aspx"));

aux2 = insFld(aux1, gFld("Report", null));
insDoc(aux2, gLnk(2, "Buku Beban Report","Collection/Report/RptBukuBebanInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Summary Activity Collector Report ","Collection/Report/RptSummaryActivityCollectorInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Detail Activity Collector Report ","Collection/Report/RptDetailActivityCollectorInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Cases Summary Report ","Collection/Report/RptCasesSummaryInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Cases Detail Report ","Collection/Report/RptCasesDetailInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Repossess Asset By Periode Report ","Collection/Report/RptRepossessPeriodInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Repossess Asset By As Of Aging Report ","Collection/Report/RptRepossessAsOfAgingInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Repossess Asset Selling Report ","Collection/Report/RptRepoAssetSellingInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Repossess Asset Inventory Report ","Collection/Report/RptRepoInvInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Collectibility Report ","Collection/Report/RptCollectibilityInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Account Analizer Report ","Collection/Report/RptAccountAnalizerInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Flow Rate Report ","Collection/Report/RptFlowReportInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Performance Review Report ","Collection/Report/RptPerformanceReviewInputParameter.aspx"));
insDoc(aux2, gLnk(2, "Form Analisa Kasus ","Collection/Report/FrmAnalisaKasusInputParameter.aspx"));


aux1 = insFld(foldersTree, gFld('AR Monitoring', null));
aux2 = insFld(aux1, gFld("Inquiry", null));
insDoc(aux2, gLnk(2, "Change Address","ARMonitoring/ChangeAddress.htm"));

aux1 = insFld(foldersTree, gFld('Setting', null));
aux2 = insFld(aux1, gFld("Organization", null));
insDoc(aux2, gLnk(2, "Company","Setting/Company.htm"));
//insDoc(aux2, gLnk(2, "Area","Setting/Area.htm"));
insDoc(aux2, gLnk(2, "Branch","Setting/Branch.htm"));
//insDoc(aux2, gLnk(2, "Departement","Setting/Departement.htm"));
//insDoc(aux1, gLnk(2, "Approval Scheme","UnderConstruction.htm"));
aux2 = insFld(aux1, gFld("Report", null));
insDoc(aux2, gLnk(2, "Aging Bucket","Setting/AgingBucket.htm"));
insDoc(aux2, gLnk(2, "Installment Amount","Setting/ReportInstallmentAmount.htm"));
insDoc(aux2, gLnk(2, "Finance Amount","Setting/ReportFinanceAmount.htm"));
insDoc(aux2, gLnk(2, "Percent Effective","Setting/ReportPercentEff.htm"));
insDoc(aux2, gLnk(2, "Percent DP","Setting/ReportPercentDP.htm"));
insDoc(aux1, gLnk(2, "ZipCode","Setting/ZipCode.htm"));
aux2 = insFld(aux1, gFld("General", null));
insDoc(aux2, gLnk(2, "Term & Condition","Setting/TermCondition.htm"));
insDoc(aux2, gLnk(2, "Economy Sector","Setting/EconomicSector.htm"));
insDoc(aux2, gLnk(2, "Industry Type","Setting/IndustryType.htm"));
insDoc(aux2, gLnk(2, "Master","Setting/Master.htm"));
insDoc(aux2, gLnk(2, "Reason Type","Setting/ReasonType.htm"));
insDoc(aux2, gLnk(2, "Employee Position","Setting/EmployeePosition.htm"));

aux1 = insFld(foldersTree, gFld('Inquiries', null));
insDoc(aux1, gLnk(2, "Smart Search","Inquiries/SmartSearch.htm"));
//aux2 = insFld(aux1, gFld("Smart Search", null));
//insDoc(aux2, gLnk(2, "Customer","Inquiries/SmartSearchCustomer.htm"));
//insDoc(aux2, gLnk(2, "Agreement","Inquiries/SmartSearchAgreement.htm"));
//insDoc(aux2, gLnk(2, "Asset","Inquiries/SmartSearchAsset.htm"));
//insDoc(aux2, gLnk(2, "Insurance","Inquiries/SmartSearchInsurance.htm"));
//insDoc(aux2, gLnk(2, "Negative List","Inquiries/SmartSearchNegative.htm"));
//insDoc(aux1, gLnk(2, "View Journal","AccMaintenance/JournalView.htm"));

aux1 = insFld(foldersTree, gFld('Asset Buy', null));
insDoc(aux1, gLnk(2, "Vendor","AssetBuy/Vendor.htm"));
aux2 = insFld(aux1, gFld("Credit Process", null));
insDoc(aux2, gLnk(2, "Mutual Agreement - Batch - Agreement","AssetBuy/MutualAgreement.htm"));
insDoc(aux2, gLnk(2, "Load Data Agreement","AssetBuy/LoadDataContract.htm"));
insDoc(aux2, gLnk(2, "Entry Check List","AssetBuy/EntryCheckList.htm"));
insDoc(aux2, gLnk(2, "Realisasi Batch","AssetBuy/RealisasiBatch.htm"));
insDoc(aux1, gLnk(2, "Payment Receive","AssetBuy/PaymentReceive.htm"));
aux2 = insFld(aux1, gFld("Stop Accrued/NPL", null));
insDoc(aux2, gLnk(2, "Request","AssetBuy/StopAccrued.htm"));
insDoc(aux2, gLnk(2, "Approval","AssetBuy/StopAccruedApproval.htm"));
insDoc(aux2, gLnk(2, "Reversal","AssetBuy/AgreementStopAccruedReversal.htm"));
insDoc(aux2, gLnk(2, "Inquiry","AssetBuy/StopAccruedInquiry.htm"));
aux2 = insFld(aux1, gFld("Prepayment", null));
insDoc(aux2, gLnk(2, "Request","AssetBuy/EarlyTermination.htm"));
insDoc(aux2, gLnk(2, "Approval","AssetBuy/PrepaymentApproval.htm"));
insDoc(aux2, gLnk(2, "Execution","AssetBuy/PrepaymentExecution.htm"));
insDoc(aux2, gLnk(2, "Inquiry","AssetBuy/PrepaymentInquiry.htm"));
aux2 = insFld(aux1, gFld("Reports", null));
insDoc(aux2, gLnk(2, "Sales","AssetBuy/RptSales.htm"));
insDoc(aux2, gLnk(2, "Aging","AssetBuy/RptAging.htm"));
insDoc(aux2, gLnk(2, "Kewajiban yang harus dibayar Vendor","AssetBuy/RptKewajibanVendor.htm"));
insDoc(aux2, gLnk(2, "Outstanding BPKB","AssetBuy/RptOutstandingBPKB.htm"));
insDoc(aux2, gLnk(2, "Renewal Insurance","AssetBuy/RptRenewalInsurance.htm"));
insDoc(aux2, gLnk(2, "Perpanjangan KTP","AssetBuy/RptPerpanjanganKTP.htm"));

aux1 = insFld(foldersTree, gFld("Approval System", null));
insDoc(aux1, gLnk(2, "Approval Type","Approval/AM_Approval_001.htm"));
insDoc(aux1, gLnk(2, "Approval Scheme","Approval/AM_Approval_002.htm"));

aux1 = insFld(foldersTree, gFld('Utilities', null));
insDoc(aux1, gLnk(2, "Trial Calculation Electronics","Credit/TrialCalculation_Electronics.htm"));

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