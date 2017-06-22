Get started with ${app}
-----------------------------------
Welcome to your new Java Cache Starter! 
               
Get started with this Java Cache Starter application that uses IBM DataCache Java native APIs, powered by WebSphere eXtreme Scale technology.

1. [Install the cf command-line tool](${doc-url}/#starters/BuildingWeb.html#install_cf).
2. [Download the starter application package](${ace-url}/rest/apps/${app-guid}/starter-download).
3. Extract the package and `cd` to it.
4. Connect to Bluemix:

		cf api ${api-url}

5. Log into Bluemix:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. Compile the Java code and generate the war package using ant.
7. Deploy your app:

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. Access your app: [http://${route}](http://${route})
9. You can also import the starter application package into Eclipse and [Deploy using IBM Eclipse Tools for Bluemix](${doc-url}/#manageapps/eclipsetools.html#eclipsetools).
