# Problem statement

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the <b><i>User</b></i> class:

<pre>
      <code>
            public User(String firstName, String lastName, String email,
                       String address, String phone, int age) {
                 // ...
            }
      </code>
</pre>

However, you encounter challenges:

<ul>
    <li>Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.</li>
    <li>Optional fields: Not all customers provide complete information, but the constructor forces them to.</li>
    <li>Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.</li>
</ul>

Implement solution using the Builder Pattern to address the issue.

# Class Diagram
