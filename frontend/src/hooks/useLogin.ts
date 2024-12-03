import React from 'react'
import { useState } from 'react'

// Validations.
import { emailValidation, passwordValidation } from '../utils/validations'

interface IUseLogin {
  email: string
  setEmail: React.Dispatch<React.SetStateAction<string>>
  password: string
  setPassword: React.Dispatch<React.SetStateAction<string>>
  emailValidation(param: string): boolean
  passwordValidation(param: string): boolean
}

export default function useLogin(): IUseLogin {
  const [email, setEmail] = useState<string>('')
  const [password, setPassword] = useState<string>('')

  return {
    email,
    setEmail,
    password,
    setPassword,
    emailValidation,
    passwordValidation,
  }
}
