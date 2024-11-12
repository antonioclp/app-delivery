import { Link } from 'react-router-dom'

export default function Login() {
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
              stroke-width="5"
            />
            <polygon
              points="50,15 15,85 85,85"
              fill="white"
              stroke="black"
              stroke-width="2.5"
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
            <label>Email</label>
            <input
              type="text"
              placeholder="example@domain.com.br"
            />
          </div>
          <div>
            <label>Password</label>
            <input
              type="password"
            />
          </div>
        </section>
        <section>
          <div>
            <button type="submit">Sing in</button>
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
