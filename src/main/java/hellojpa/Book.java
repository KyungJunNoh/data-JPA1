package hellojpa;

import net.bytebuddy.asm.Advice;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name = "B")
public class Book extends Item{

    private String author;
    private String item;
}
