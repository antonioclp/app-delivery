import { Route, Routes } from 'react-router-dom'

// Pages.
import { Home, Login } from './pages'

/**
 * App routes.
 * @returns {JSX.Element}
 */
function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/login" element={<Login />} />
      <Route path="/">
        <Route path="*" element={<span>404 page not found.</span>} />
      </Route>
    </Routes>
  )
}

export default App
