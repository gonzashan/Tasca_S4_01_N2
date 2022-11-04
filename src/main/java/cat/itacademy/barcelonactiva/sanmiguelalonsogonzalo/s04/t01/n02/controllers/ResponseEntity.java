package cat.itacademy.barcelonactiva.sanmiguelalonsogonzalo.s04.t01.n02.controllers;


public class ResponseEntity {

    private final String content;

    public ResponseEntity(String content) {

        this.content = content;
    }

    public String getContent() {
        return content;
    }

}