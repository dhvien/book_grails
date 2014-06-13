package com.company.project

import grails.converters.JSON
import grails.converters.XML

class BookController {

    def list() {
		withFormat {
			xml {
				render Book.list() as XML
			}
			json{
				render Book.list() as JSON
			}
		}
	}
	
	def show(Integer id){
		def book = Book.get(id)
		if (book){
			withFormat {
				xml {
					render book as XML
				}
				json{
					render book as JSON
				}
			}
		}
		else{
			render 'Book not found'
		}
	}
	
	def save() {
		def book = new Book(params)
		def flag = true
		Book.list().each{ b ->
			if (b.isbn == book.isbn){
				flag = false
				render "Book already exists"
			}

		}
		if (flag){
			book.save()
			render "Success!!"
		}
	}
	
}
