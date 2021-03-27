pipeline {
 agent any

 tools {
  maven "Maven3" 
  git "Default"
 }


 stages {
   stage ('hello'){
     steps {
      echo 'hello world'
     }
   }

   stage ('build') {
     steps {
	sh 'git checkout origin'
	//sh 'git pull'
         sh 'mvn clean install'
         sh 'pwd'
	 //sh 'cd "/home/fernando/NetBeansProjects/Lab1-analisis/"'
	 sh 'ls'
	// sh 'git log'
     }

   }
 }
	post {
		   success {
		 //sshagent(credentials: ['githubssh']){
		   withCredentials([usernamePassword(credentialsId:'jfer', passwordVariable:'PASSWORD',usernameVariable:'USERNAME')]){			
		      // echo USERNAME
		       script {
			  env.encodedPass=URLEncoder.encode(PASSWORD,"UTF-8")
			}
		       ////sh 'git checkout origin/master'
			sh 'git checkout origin'
		       sh 'cp target/Lab1-analisis-1.0-SNAPSHOT.war app.war'
		       sh 'git add .'
		       sh 'git branch'
		       //sh 'git pull'
		       sh 'git commit -m "app war"'
		       sh 'git push  https://${USERNAME}:${encodedPass}@github.com/JFernando1/AnalisisII-LAB.git'
		      // sh 'bash automatic-tags.sh'
			 //sh 'git pull'
			
			sh '''#!/bin/bash
				version="$(git describe --tags)"
				echo "$version"

				VERSION_BITS=(${version//./ })
				nversion=${VERSION_BITS[2]}
				#echo ${nversion:0:1}
				nversion=${nversion:0:1}
				nversion=$((nversion+1))
				newversion=${VERSION_BITS[0]}.${VERSION_BITS[1]}.$nversion
				echo "Creando un nuevo tag de la version $version a $newversion"

				echo "$(git tag $newversion)"
				#push del nuevo tag
				echo "$(git push https://${USERNAME}:${encodedPass}@github.com/JFernando1/AnalisisII-LAB.git  --tags)"


			'''





		    	//sh 'bash newrelease.sh'
/*
			  sh '''#!/bin/bash
				token="993df802a23d9f4827f43a21bc39cb204eb14eb3"
				vrelease="$(git describe --tags)"

				curl -H "Authorization:token $token"--data '{"tag_name": "$vrelase","target_commitish"::"origin","name": "v$vrelease","body": "Release of version $vrelease","draft": false,"prerelease": false}' https://api.github.com/repos/JFernando1/AnalisisII-LAB/releases/
			  '''*/
			//newrelease


		       sh 'ls target/'


			
		   }

		  // }
		   }
	   
	   }

}
