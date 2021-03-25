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
     }
   }
 }

}
