import './style.css'

import { setupCounter } from './counter.js'

document.querySelector('#app').innerHTML = `
  <div>
    
    <p class="read-the-docs">
      Click on the Vite logo to learn more
    </p>
  </div>
`

setupCounter(document.querySelector('#counter'))
