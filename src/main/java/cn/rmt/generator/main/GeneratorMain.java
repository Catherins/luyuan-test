package cn.rmt.generator.main;

import cn.org.rapid_framework.generator.Generator;
import cn.org.rapid_framework.generator.GeneratorFacade;
import cn.org.rapid_framework.generator.GeneratorProperties;


public class GeneratorMain {
	/**
	 * 请直接修改以下代码调用不同的方法以执行相关生成任务.
	 */
	public static void main(String[] args) throws Exception {
		Generator busCodeGenerator = new Generator();
		busCodeGenerator.addTemplateRootDir("template");
		busCodeGenerator.setOutRootDir(GeneratorProperties.getProperty("outRoot"));
		GeneratorFacade generatorFacade = new GeneratorFacade();
		generatorFacade.setGenerator(busCodeGenerator);
		generatorFacade.deleteOutRootDir();
		generatorFacade.generateByTable("user");
	}
}
