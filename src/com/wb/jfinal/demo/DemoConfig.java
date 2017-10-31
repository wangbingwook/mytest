package com.wb.jfinal.demo;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
        me.setDevMode(true);		
	}

	@Override
	public void configEngine(Engine me) {
		// TODO Auto-generated method stub
        
	}

	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub

	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
        me.add("/hello",HelloController.class);
	}

}
