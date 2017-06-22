Initiation à ${app}
-----------------------------------
Bienvenue dans votre nouvelle application Java Cache Starter !
               
Initiez-vous à cette application Java Cache Starter qui utilise des API natives Java d'IBM Data Cache, optimisée par la technologie WebSphere
eXtreme Scale. 

1. [Installez l'outil de ligne de commande cf](${doc-url}/#starters/BuildingWeb.html#install_cf).
2. [Téléchargez le package d'applications du module de démarrage](${ace-url}/rest/apps/${app-guid}/starter-download).
3. Procédez à l'extraction du package et placez-vous dans le répertoire correspondant à l'aide de la commande `cd`. 
4. Accédez à Bluemix :

		cf api ${url-api}

5. Connectez-vous à Bluemix :

		cf login -u ${nom-utilisateur}
		cf target -o ${org} -s ${espace}
		
6. Compilez le code Java et générez le package war à l'aide d'ant. 
7. Déployez votre application :

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. Accédez à votre application : [http://${route}](http://${route})
9. Vous pouvez aussi importer le package d'applications du module de démarrage dans Eclipse et
[procéder au déploiement à l'aide d'IBM Eclipse Tools for Bluemix](${doc-url}/#manageapps/eclipsetools.html#eclipsetools).
