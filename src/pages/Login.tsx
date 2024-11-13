import React from 'react'
import { Link } from 'react-router-dom'

// Custom hooks.
import { useLogin } from '../hooks'

export default function Login() {
  const {
    email,
    setEmail,
    password,
    setPassword,
    emailValidation,
    passwordValidation,
  } = useLogin()

  const handleChange = (e: React.ChangeEvent<HTMLInputElement>): void => {
    const { id, value } = e.target

    switch (id) {
      case 'email-input':
        setEmail(value)
        break
      case 'password-input':
        setPassword(value)
        break
      default:
        break
    }
  }

  return (
    <main>
      <section>
        <div>
          <svg width="100" height="100" xmlns="http://www.w3.org/2000/svg">
            <rect width="100" height="100" fill="#FFD700" />
            <rect
              x="2.5"
              y="2.5"
              width="95"
              height="95"
              fill="none"
              stroke="black"
              strokeWidth="5"
            />
            <polygon
              points="50,15 15,85 85,85"
              fill="white"
              stroke="black"
              strokeWidth="2.5"
            />
            <rect x="45" y="35" width="10" height="25" fill="black" />
            <circle cx="50" cy="70" r="5" fill="black" />
          </svg>
        </div>
        <div>
          Delivery App
        </div>
      </section>
      <form>
        <section>
          <div>
            <label htmlFor="email-input">Email</label>
            <input
              type="text"
              id="email-input"
              placeholder="example@domain.com.br"
              onChange={(e) => handleChange(e)}
            />
          </div>
          <div>
            <label htmlFor="password-input">Password</label>
            <input
              type="password"
              id="password-input"
              onChange={(e) => handleChange(e)}
            />
          </div>
        </section>
        <section>
          <div>
            <button
              type="submit"
              disabled={!(emailValidation(email) &&
                passwordValidation(password))}
            >
              Sing in
            </button>
          </div>
          <div>
            <span>
              Don't have any account?
              <Link to="/register">Register</Link>
            </span>
          </div>
          <div>
            <span>Error message</span>
          </div>
        </section>
      </form>
    </main>
  )
}
