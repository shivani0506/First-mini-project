package in.ashokit.sevice;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Contact;
import in.ashokit.repository.ContactRepository;
@Service
public class ContectServiceImpml implements ContectService {
	@Autowired
	private ContactRepository repository;
	
	@Override
	public String saveContact(Contact contact) {
		
	 contact=repository.save(contact);
		
		  if(contact!=null) { return "suscees fully save";
		  } 
		  else { return
		  "not save succesfully"; }
		 
	
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact>contacts=repository.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact>findById=repository.findById(contactId);
		return null;
	}

	@Override
	public String updateContact(Contact contact) {
		if(repository.existsById(contact.getContactId())) {
		repository.save(contact);
		return "update successfully";
	}else {
		
		return "no recode found";
	}
	}

	@Override
	public String deleteContactById(Integer contactId) {
		if(repository.existsById(contactId)){
		repository.deleteById(contactId);
		return "recode deleted";
		}
		return "recode not found";
	}

}
