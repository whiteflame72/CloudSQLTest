<%@taglib uri="/struts-tags" prefix="s"%>

<h1>Add Movie</h1>

<div>
    <s:form action="add" namespace="/movie">
        <s:include value="form.jsp" />
    </s:form>
</div>
