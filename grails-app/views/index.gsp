<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Form</title>
	</head>
	<body>
        <g:form controller="book" action="save">
            <label>Title: </label>
            <g:textField name="title"/><br/>

            <label>ISBN: </label>
            <g:textField name="isbn"/><br/>

            <g:actionSubmit value="Save"/>
        </g:form>
	</body>
</html>