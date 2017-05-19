def generateSampleJob = freeStyleJob("bago")

generateSampleJob.with {
	steps {
	git('https://github.com/ardwin1112/junit-sample.git')
	}
} 
