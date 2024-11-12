import { Route, Routes } from 'react-router-dom'

// Pages.
import { Home } from './pages'

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
