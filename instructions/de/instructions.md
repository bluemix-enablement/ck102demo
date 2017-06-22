Einführung in ${app}
-----------------------------------
Willkommen bei Ihrem neuen Java Cache Starter!
               
Einführung in diese Java Cache Starter-Anwendung, die mit nativen IBM DataCache-Java-APIs arbeitet (eine WebSphere eXtreme Scale-Lösungstechnologie).

1. [Das Befehlszeilentool 'cf' installieren](${doc-url}/#starters/BuildingWeb.html#install_cf).
2. [Das Starteranwendungspaket herunterladen](${ace-url}/rest/apps/${app-guid}/starter-download).
3. Das Paket extrahieren und nach `cd` wechseln.
4. Verbindung zu Bluemix herstellen:

		cf api ${api-url}

5. Bei Bluemix anmelden:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. Java-Code kompilieren und WAR-Paket mit 'ant' generieren.
7. Ihre Anwendung (App) bereitstellen:

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. Auf Ihre Anwendung (App) zugreifen: [http://${route}](http://${route})
9. Sie können das Starteranwendungspaket auch in Eclipse importieren und [mithilfe von IBM Eclipse Tools for Bluemix implementieren](${doc-url}/#manageapps/eclipsetools.html#eclipsetools).
