<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
	<base href="<%=basePath %>">
	<title>Nicky's blog</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="Keywords" content="" >
	<meta name="Description" content="" >
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<link href="static/blog/css/blog.css" rel="stylesheet" />
	<link rel="stylesheet" href="plugins/editormd/css/editormd.preview.css" />
	<link href='http://fonts.googleapis.com/css?family=Arizonia' rel='stylesheet' type='text/css' />
	<style>
		.editormd-html-preview {
			width: 90%;
			margin: 0 auto;
		}
	</style>
</head>
<body>
<%@ include file="../frame/top.jsp" %>
<div class="blank"></div>
<div class="article">
	<div class="content" id="layer">
		<div id="test-editormd-view">
			<h2>${article.articleName}</h2>
                <textarea id="append-test" style="display:none;">${article.articleContent}</textarea>
		</div>
	</div>
</div>
<script src="static/js/jquery-1.8.3.js"></script>
<script src="plugins/editormd/lib/marked.min.js"></script>
<script src="plugins/editormd/lib/prettify.min.js"></script>

<script src="plugins/editormd/lib/raphael.min.js"></script>
<script src="plugins/editormd/lib/underscore.min.js"></script>
<script src="plugins/editormd/lib/sequence-diagram.min.js"></script>
<script src="plugins/editormd/lib/flowchart.min.js"></script>
<script src="plugins/editormd/lib/jquery.flowchart.min.js"></script>

<script src="plugins/editormd/editormd.js"></script>
<script type="text/javascript">
    $(function() {
        var testEditormdView;
        /*$.get("test.md", function(markdown) {

            testEditormdView = editormd.markdownToHTML("test-editormd-view", {
                markdown        : markdown ,//+ "\r\n" + $("#append-test").text(),
                //htmlDecode      : true,       // ?????? HTML ????????????????????????????????????????????????
                htmlDecode      : "style,script,iframe",  // you can filter tags decode
                //toc             : false,
                tocm            : true,    // Using [TOCM]
                //tocContainer    : "#custom-toc-container", // ????????? ToC ?????????
                //gfm             : false,
                //tocDropdown     : true,
                // markdownSourceCode : true, // ???????????? Markdown ??????????????????????????????????????? Textarea ??????
                emoji           : true,
                taskList        : true,
                tex             : true,  // ???????????????
                flowChart       : true,  // ???????????????
                sequenceDiagram : true,  // ???????????????
            });

            //console.log("???????????? jQuery ?????? =>", testEditormdView);

            // ??????Markdown??????
            //console.log(testEditormdView.getMarkdown());

            //alert(testEditormdView.getMarkdown());
        });*/
        testEditormdView = editormd.markdownToHTML("test-editormd-view", {
            htmlDecode      : "style,script,iframe",  // you can filter tags decode
            emoji           : true,
            taskList        : true,
            tex             : true,  // ???????????????
            flowChart       : true,  // ???????????????
            sequenceDiagram : true,  // ???????????????
        });
    });
</script>
<%@ include file="../frame/footer.jsp" %>
</body>
</html>