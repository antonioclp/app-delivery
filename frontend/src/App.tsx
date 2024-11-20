import { Route, Routes } from 'react-router-dom'

// Pages.
import { Home } from './pages'

/**
 * App routes.
 * @returns {JSX.Element}
 */
function App() {
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/">
        <Route path="*" element={<span>404 page not found.</span>} />
      </Route>
    </Routes>
  )
}

export default App
