package br.com.brendowpodsclan.sith.endpoint;

import br.com.brendowpodsclan.sith.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("authors")
public class AuthorsEndpoint {

    @Autowired
    Author author;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String post(@PathVariable("id") int id, @RequestParam(value = "author", required = false) String author) {
        String lord = "Darth Vader";
        if (id == 3 && lord.equals(author)) {
            return "Welcome to the Sith Order, Darth Vader, your id is 3";
        }
        this.author.setId(id);
        return "Author: " + this.author.getName() + "\nID: " + this.author.getId();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String post(@RequestBody Author author) {
        return author.getName() + " was born in " + author.getBirth();
    }
}
