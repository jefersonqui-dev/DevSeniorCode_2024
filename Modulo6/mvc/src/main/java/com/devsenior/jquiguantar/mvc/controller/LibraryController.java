package com.devsenior.jquiguantar.mvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class LibraryController {

    @RestController
    @RequestMapping("/api/library")
    public class LibraryController {

        private final LibraryService libraryService;

        public LibraryController(LibraryService libraryService) {
            this.libraryService = libraryService;
        }

        @GetMapping("/books")
        public List<Book> getAllBooks() {
            return libraryService.getAllBooks();
        }

        @GetMapping("/authors")
        public List<Author> getAllAuthors() {
            return libraryService.getAllAuthors();
        }
}
