def generateSampleJob = freeStyleJob("bago")

generateSampleJob.with {
	steps {
		scm{
	git('https://github.com/ardwin1112/junit-sample.git')
	}
	}
} 
