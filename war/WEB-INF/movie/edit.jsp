<%@taglib uri="/struts-tags" prefix="s"%>

<h1>Edit Movie ${movieId}</h1>

<div>
	<s:if test="movie != null">
		<s:form action="edit" namespace="/movie">
		    <s:include value="form.jsp" />
		</s:form>
	</s:if>
	<s:else>
		<s:text name="error.notFound" />
	</s:else>
</div>
