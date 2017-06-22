Empiece a trabajar con ${app}
-----------------------------------
Bienvenido a su nueva app Java Cache Starter.

               
Empiece a trabajar con esta aplicación Java Cache Starter que utiliza API nativas de IBM DataCache Java, basadas en la tecnología WebSphere eXtreme Scale. 

1. [Instale la herramienta de línea de mandatos cf](${doc-url}/#starters/BuildingWeb.html#install_cf).
2. [Descargue el paquete de aplicación de inicio](${ace-url}/rest/apps/${app-guid}/starter-download).
3. Extraiga el paquete y ejecute `cd` para ir al mismo. 
4. Conéctese a Bluemix:

		cf api ${api-url}

5. Inicie la sesión en Bluemix:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. Compile el código Java y genere el paquete war mediante ant. 
7. Despliegue su app:

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. Acceda a su app: [http://${route}](http://${route})
9. También puede importar el paquete de aplicación de inicio en Eclipse y [Desplegarla mediante las herramientas de IBM Eclipse para Bluemix](${doc-url}/#manageapps/eclipsetools.html#eclipsetools).
