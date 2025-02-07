package com.example.demo.DTO;

import com.example.demo.validation.CorrectNumber;
import com.example.demo.validation.EmailConstraint;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedallaDTO {
    @NotBlank(message = "Nombre obligatorio")
    private String nombre;

    @NotBlank(message = "imagen obligatorio")
    private String imagen;

    UsuarioDTO usuarioDTO;
}
