package com.emanuel.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.emanuel.agenda.repository.Contatos;

@Controller
@RequestMapping("/agenda")
public class ContatoController {
	
	@Autowired
	private Contatos contatos;
	
	@RequestMapping
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("/index");
		return mv;
	}
	
	@RequestMapping("/listarContato")
	public ModelAndView listarContato(){
		ModelAndView mv = new ModelAndView("/contato/listarContato");
		mv.addObject("contatos", contatos.findAll());
		
		return mv;
	}

}
