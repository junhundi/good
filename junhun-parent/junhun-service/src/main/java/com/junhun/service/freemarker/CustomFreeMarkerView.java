package com.junhun.service.freemarker;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by kevin on 2016/12/21.
 */
public class CustomFreeMarkerView extends FreeMarkerView {

	@Override
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
		super.exposeHelpers(model, request);

		model.put("ctx", request.getContextPath());
	}
}
