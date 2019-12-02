import React, { useState, useEffect } from 'react';
import PropTypes from 'prop-types';
import TextField from '@material-ui/core/TextField';
import { FormattedMessage } from 'react-intl';
import MenuItem from '@material-ui/core/MenuItem';
import ListItemText from '@material-ui/core/ListItemText';
import Checkbox from '@material-ui/core/Checkbox';
import Box from '@material-ui/core/Box';

import API from 'AppData/api';
import { withAPI } from 'AppComponents/Apis/Details/components/ApiContext';

function APICategories(props) {
    const [categories, setCategories] = useState({});
    const { api, configDispatcher } = props;

    console.log(api.selectedCategories);

    useEffect(() => {
        API.apiCategories().then((response) => setCategories(response.body));
    }, []);

    // const handleValidateAndChange = ({ target: { value, name } }) => {
    //     onChange({ target: { name, value } });
    // };

    if (!categories.list) {
        return null;
    } else {
        return (
            <Box style={{ marginTop: 10 }}>
                <TextField
                    fullWidth
                    select
                    label={(
                        <>
                            <FormattedMessage
                                id='Apis.Details.Configurations.api.categories'
                                defaultMessage='API Categories'
                            />
                        </>
                    )}
                    name='categories'
                    margin='normal'
                    variant='outlined'
                    value={api.categories}
                    SelectProps={{
                        multiple: true,
                        renderValue: (selected) => (Array.isArray(selected) ? selected.join(', ') : selected),
                    }}
                    onChange={(e) => configDispatcher({ action: 'categories', value: e.target.value })}
                    InputProps={{
                        id: 'itest-id-categories-input',
                    }}
                    helperText='Select API Categories for the API'
                >
                    {categories.list.map((category) => (
                        <MenuItem
                            dense
                            disableGutters
                            id={category.id}
                            key={category.name}
                            value={category.name}
                        >
                            <Checkbox color='primary' checked={api.categories.includes(category.name)} />
                            <ListItemText primary={category.name} secondary={category.description} />
                        </MenuItem>
                    ))}
                </TextField>
            </Box>
        );
    }
}

APICategories.defaultProps = {
    categories: [],
    api: PropTypes.shape({}).isRequired,
    configDispatcher: PropTypes.func.isRequired,
};

export default withAPI(APICategories);
