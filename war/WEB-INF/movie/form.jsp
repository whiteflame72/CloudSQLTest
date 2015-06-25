<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="sj" %>

<div id="messages">
<s:actionerror />
</div>

<s:push value="movie">
	<s:hidden name="id" />
	
    <p>
        <s:label key="label.date" />
        <sj:datepicker name="date" displayFormat="dd/mm/yy" />
        <s:fielderror fieldName="date" />
    </p>
    <p>
        <s:label key="label.title" />
        <s:textfield name="title" />
        <s:fielderror fieldName="title" />
    </p>
    <p>
        <s:label key="label.genre" />
        <s:textfield name="genre" />
        <s:fielderror fieldName="genre" />
    </p>
    <p>
        <s:label key="label.url" />
        <s:textfield name="url" />
        <s:fielderror fieldName="url" />
    </p>
    <p>
        <s:label key="label.catalogNo" />
        <s:textfield name="catalogNo" />
        <s:fielderror fieldName="catalogNo" />
    </p>
    <p>
        <s:label key="label.upc" />
        <s:textfield name="upc" />
        <s:fielderror fieldName="upc" />
    </p>

	<p>
	    <s:hidden name="save" value="true" />
	    <s:submit key="label.save" name="" />
	    <s:submit key="form.cancel" onclick="window.location.href = './index.action';return false;" />
	</p>
</s:push>
