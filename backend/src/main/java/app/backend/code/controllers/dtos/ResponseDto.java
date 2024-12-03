package app.backend.code.controllers.dtos;

/**
 * Dto format to default api response.
 */
public record ResponseDto<T>(T data, String message) {
}
