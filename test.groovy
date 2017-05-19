folder( "try" ) {
    
}
def folder = "try"
def generatejob = folder + "/this"

freeStyleJob(generatejob)
{

	steps {
	scm {
        git {
            remote {
                url('https://github.com/ardwin1112/junit-sample.git')
                credentials('e0b9cd96-7ad0-4a46-b1ac-2c5abd405aac')
            }
        }
    }
	maven {
		mavenInstallation('maven')
		goals('package')
		
	}
	} 
	
}   