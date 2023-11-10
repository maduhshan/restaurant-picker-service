package gov.sg.tech.domain;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinSessionRequest {

    @Nonnull
    private Long userId;
}
