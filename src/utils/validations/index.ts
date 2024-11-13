export function emailValidation(email: string) {
  const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/
  return emailRegex.test(email)
}

export function passwordValidation(password: string) {
  const passwordRegex = /^.{6,}$/
  return passwordRegex.test(password)
}
