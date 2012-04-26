<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Explorer</title>
<link rel="STYLESHEET" type="text/css" href="dhtmlxTree/codebase/dhtmlxtree.css">
<link rel="STYLESHEET" type="text/css" href="dhtmlxGrid/codebase/dhtmlxgrid.css">
<link rel="STYLESHEET" type="text/css" href="dhtmlxGrid/codebase/dhtmlxgrid_skins.css">


</head>
<body>
<jsp:include page="mycloudLinks.jsp"></jsp:include>
<br/>
<br/>
<html:form action="/login.do">
<table>
<tr>
 <td>
 <html:button value="Folder" property="Folder" onclick="doSubmit('folder');"/>
 </td>
 <td>
 <html:button value="Download" property="Download" onclick="doSubmit('download');"/>
 </td>
 <td>
 <html:button value="Delete" property="Delete" onclick="doSubmit('delete');"/>
 </td>
 <td>
 <html:button value="Upload" property="Upload" onclick="doSubmit('upload');"/>
 </td>
 </tr>
</table>
<table>
    <tr>
        <td valign="top">        
            <div id="treeboxbox_tree" style="width:250px; height:500px;background-color:#f5f5f5;border :1px solid Silver;"></div>            
        </td>
        <td valign="top">        
            <div id="treegrid_tree" style="width:500px; height:500px;background-color:#f5f5f5;border :1px solid Silver;"></div>            
        </td>
        </tr>
        </table>
<script  src="dhtmlxTree/codebase/dhtmlxcommon.js"></script>
<script  src="dhtmlxTree/codebase/dhtmlxtree.js"></script>
<script  src="dhtmlxGrid/codebase/dhtmlxgrid.js"></script>
<script  src="dhtmlxGrid/codebase/dhtmlxgridcell.js"></script>
<script type="text/javascript">
var historyAr = new Array();
tree = new dhtmlXTreeObject("treeboxbox_tree", "100%", "100%", 0);
tree.setSkin('dhx_skyblue');
tree.setImagePath("dhtmlxTree/codebase/imgs/csh_bluebooks/");

tree.loadXML("dhtmlxTree/samples/common/tree3.xml");

mygrid = new dhtmlXGridObject('treegrid_tree');
mygrid.setImagePath("dhtmlxGrid/codebase/imgs/");
mygrid.setHeader("&nbsp;,Name,Size,Type,Modified");
mygrid.setColTypes("img,ro,ro,ro,ro");
mygrid.setInitWidths("40,250,50,100,*");
mygrid.setColAlign("center,left,right,left");
mygrid.init();
mygrid.setSkin("dhx_skyblue");
mygrid.loadXML("dhtmlxGrid/samples/common/grid.xml");

function doSubmit(action)
{
	document.forms[0].action = "action" + ".do";
	document.forms[0].submit();
}
</script>
</html:form>
</body>
</html>