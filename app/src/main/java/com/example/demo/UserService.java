package com.example.demo;

public interface UserService {

   Call<LoginResponse> userLogin(@Body LoginRequest loginRequest)
}
