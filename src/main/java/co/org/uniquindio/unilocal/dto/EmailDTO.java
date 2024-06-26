package co.org.uniquindio.unilocal.dto;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import jakarta.validation.constraints.Email;

import java.io.File;
import java.io.InputStream;

public record EmailDTO (
        @NotBlank @Length(max = 40) String asunto,
        @NotBlank @Length(max = 1000) String cuerpo,
        @NotBlank @Email @Length(max = 100) String destinatario
) {

}
