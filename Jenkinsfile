pipeline {
    agent any
     
    tools {
        maven "Maven3.6.0"
    }
    stages {
		stage('Git-CheckOut') {
            steps {
				git 'https://github.com/saravanaprabuA/GitMvnWarRepo.git'
			}
        }
        stage('Mvn_Build') {
            steps {
                echo "M2_HOME = ${M2_HOME}"
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
			}
        }
        stage('test') {
            steps {
				echo "Test stage completed";
			}
        }
        stage('deploy') {
            steps {
				deploy adapters: [tomcat9(credentialsId: 'bd30a2d1-e69e-4dbb-a3f4-3a4b07d8c836', path: '', url: 'http://localhost:8081')], contextPath: 'DeclarativeScriptApp', war: '**/*.war'
			}
        }
    }
	post {
		always {
			echo "This always run";
		}
		success {
			echo "This is success";
		}
		failure {
			echo "This is failure";
		}
		unstable {
			echo "This is unstable";
		}
		changed {
			echo "This is changed";
		}
	}
}
