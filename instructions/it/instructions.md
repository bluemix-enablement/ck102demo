Introduzione a ${app}
-----------------------------------
Benvenuti nel nuovo Java Cache Starter!
               
Introduzione all'applicazione Java Cache Starter che utilizza le API native Java IBM DataCache, con tecnologia WebSphere eXtreme Scale.

1. [Installare lo strumento della riga di comando cf](${doc-url}/#starters/BuildingWeb.html#install_cf).
2. [Scaricare il package applicazione starter](${ace-url}/rest/apps/${app-guid}/starter-download).
3. Estrarre il package e `cd`.
4. Connetti a Bluemix:

		cf api ${api-url}

5. Accedi a Bluemix:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. Compilare il codice Java e generare il package war utilizzando ant.
7. Distribuisci la app:

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. Accedi alla app: [http://${route}](http://${route})
9. È anche possibile importare il package applicazione starter in Eclipse ed eseguire la [distribuzione tramite gli strumenti IBM Eclipse per Bluemix](${doc-url}/#manageapps/eclipsetools.html#eclipsetools).
