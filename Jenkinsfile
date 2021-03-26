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
		   //  sshagent(credentials: ['thisUser-ssh-credentials']){

		       sh 'bash automatic-tags.sh'

		    // }
		   }
	   
	   }

}
