About running Cloud SQL based Google App Engine for Java

1. Make sure you do not use hibernate with JPA 2.0 (e.g. hibernate-jpa-2.0-api-1.0.0.Final.jar) as GAEJ supports only JPA 1.0.
2. Make sure you have the correct version of hibernate. A good one that works is like hibernate-core-3.3.2.GA.jar.
3. Make sure your settings are correct, for Struts 2 e.g.
    <!-- Struts theme -->
	<constant name="struts.ui.templateDir" value="template" />
    <constant name="struts.ui.theme" value="xhtml" />
    <!-- Development mode -->
    <constant name="struts.devMode" value="true" />
    <!-- Enable global file 'global.properties' -->
    <constant name="struts.custom.i18n.resources" value="global" />
4. Make sure you use the right version of MySQL and have the right settings in hibernate.cfg.xml e.g.
    <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
5. Make sure you have the following filter mapping for /struts-tags to work properly (i.e. <%@taglib uri="/struts-tags" prefix="s"%>):
	<filter-mapping>  
        <filter-name>struts2</filter-name>
        <url-pattern>/struts/*</url-pattern>  
    </filter-mapping>
and also any application specific uri e.g.
	<filter-mapping>
		<filter-name>struts2</filter-name>
		<url-pattern>/gu/*</url-pattern>
	</filter-mapping>
6. If you are using Struts, remember to append the .action (if you do not change the default) e.g.
http://localhost:8888/movie/index.action
