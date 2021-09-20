package com.workshop.email.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/template")
public class TemplateController {

	@RequestMapping("/{template}")
	public String template(@PathVariable String template, @RequestBody(required = false) Map<String, Object> attributes,
			Model model) {
		model.addAllAttributes(attributes);
		return template;
	}
}
