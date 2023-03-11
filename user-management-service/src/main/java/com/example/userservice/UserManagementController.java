package com.example.userservice;

@RestController
    @RequestMapping("/users")
public class UserManagementController {
    public class UserController {
        @Autowired
        private UserService userService;

        @GetMapping("/{id}")
        public ResponseEntity<User> getUserById(@PathVariable String id) {
            User user = userService.getUserById(id);
            return ResponseEntity.ok(user);
        }

        // other CRUD operations
    }
}
