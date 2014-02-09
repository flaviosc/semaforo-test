package com.eliasnogueira.semaforo.integration;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InstanceStepsFactory;

public abstract class StoryBase extends JUnitStory {
	@Override
	public Configuration configuration() {
	    return new MostUsefulConfiguration()
	        .useStoryLoader(new LoadFromClasspath(this.getClass()))
	        .useStoryReporterBuilder(new StoryReporterBuilder()
	                                 .withDefaultFormats());
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    public List candidateSteps() {
        return new InstanceStepsFactory(configuration(), this).createCandidateSteps();
    }
	

}