pipeline {
 agent any

 tools {
  maven "Maven3" 
 }


 stages {
   stage ('hello'){
     steps {
      echo 'hello world'
     }
   }

   stage ('build') {
     steps {
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
		       sh 'bash automatic-tags.sh'
		    
		       sh 'ls /target/'

			/*sh ('vrelease="$(git describe --tags)" && curl --data \'{"tag_name":"$vrelase","target_commitish":"master","name":"v$vrelease","body":"Release of version $vrelease","draft":false,"prerelease":false}\' https://${USERNAME}:${encodedPass}@api.github.com/repos/JFernando1/AnalisisII-LAB/releases/')*/

			
		   }

		  // }
		   }
	   
	   }

}
