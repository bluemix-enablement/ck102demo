Introdução ao ${app}
-----------------------------------
Bem-vindo ao novo Java Cache Starter!
               
Comece a usar este aplicativo Java Cache Starter que usa as APIs nativas do Java do IBM DataCache, desenvolvidas com a tecnologia WebSphere eXtreme Scale.

1. [Instale a ferramenta de linha de comandos cf](${doc-url}/#starters/BuildingWeb.html#install_cf).
2. [Faça o download do pacote de aplicativo iniciador](${ace-url}/rest/apps/${app-guid}/starter-download).
3. Extraia o pacote e `cd` para ele.
4. Conecte-se ao Bluemix:

		cf api ${api-url}

5. Efetue login no Bluemix:

		cf login -u ${username}
		cf target -o ${org} -s ${space}
		
6. Compile o código Java e gere o pacote war usando ant.
7. Implemente seu app:

		cf push ${app} -p cacheSampleJavaNativeAPIs.war


8. Acesse seu app: [http://${route}](http://${route})
9. Também é possível importar o pacote de aplicativo iniciador para o Eclipse e [Implementar usando o BM Eclipse Tools for Bluemix](${doc-url}/#manageapps/eclipsetools.html#eclipsetools).
