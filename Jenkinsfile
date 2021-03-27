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
	//sh 'git checkout origin/master'
	//sh 'git pull'
        //sh 'mvn clean install'
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
		       sh 'git checkout origin/master'
		       sh 'cp target/Lab1-analisis-1.0-SNAPSHOT.war app.war'
		       sh 'git add app.war'
		       sh 'git commit -m "app war"'
		       sh 'git branch'
		       sh 'git branch -mv master'
		       sh 'git push  https://${USERNAME}:${encodedPass}@github.com/JFernando1/AnalisisII-LAB.git -u origin refs/remotes/origin/master'
		      // sh 'bash automatic-tags.sh'
		    
		       sh 'ls target/'


			/*sh ('vrelease="$(git describe --tags)" && curl --data \'{"tag_name":"$vrelase","target_commitish":"master","name":"v$vrelease","body":"Release of version $vrelease","draft":false,"prerelease":false}\' https://${USERNAME}:${encodedPass}@api.github.com/repos/JFernando1/AnalisisII-LAB/releases/')*/

			
		   }

		  // }
		   }
	   
	   }

}
