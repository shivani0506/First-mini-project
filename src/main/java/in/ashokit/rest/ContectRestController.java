package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Contact;
import in.ashokit.sevice.ContectService;

@RestController
public class ContectRestController {
	@Autowired
	private ContectService service;
	@PostMapping("/contact")
	public ResponseEntity<String>SaveContact(@RequestBody Contact contact)
	{
		String msg =service.saveContact(contact);
	return new ResponseEntity<>(msg,HttpStatus.CREATED) ;
	}
	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>>getAllContact(){
		List<Contact>allContacts =service.getAllContacts();
		return new ResponseEntity<>(allContacts,HttpStatus.OK);
	}
@PutMapping("/contact")
public ResponseEntity<String>updateContect(@RequestBody Contact contact){
String msg =service.saveContact(contact);
return new ResponseEntity<>(msg,HttpStatus.OK);
}
@DeleteMapping("/contact/{contactId}")
public ResponseEntity<String>deleteContact(@PathVariable  Integer contactId){
String msg =service.deleteContactById(contactId);
return new ResponseEntity<>(msg,HttpStatus.OK);
}
}


