export default function Register() {
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
            <label htmlFor="fullname-input">Fullname</label>
            <input
              type="text"
              id="fullname-input"
              onChange={(e) => handleChange(e)}
            />
          </div>
          <div>
            <label htmlFor="username-input">Username</label>
            <input
              type="text"
              id="username-input"
              maxLength={14}
              onChange={(e) => handleChange(e)}
            />
          </div>
          <div>
            <label htmlFor="cpf-input">CPF</label>
            <input
              type="text"
              id="cpf-input"
              maxLength={14}
              onChange={(e) => handleChange(e)}
            />
          </div>
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
          <div>
            <label htmlFor="birthday-date">Birthday</label>
            <input
              type="date"
              id="birthday-date"
              onChange={(e) => handleChange(e)}
            />
          </div>
        </section>
        <section>
          <div>
            <button
              type="submit"
            >
              Sing up
            </button>
          </div>
          <div>
            <span>Error message</span>
          </div>
        </section>
      </form>
    </main>
  )
}
