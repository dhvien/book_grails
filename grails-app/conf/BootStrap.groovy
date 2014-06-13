import com.company.project.*

class BootStrap {

    def init = { servletContext ->
		
		def book1 = new Book(title: 'Book 1', isbn: '123').save()
		def book2 = new Book(title: 'Book 2', isbn: '432').save()
		
    }
    def destroy = {
    }
}
